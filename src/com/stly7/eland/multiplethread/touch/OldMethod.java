package com.stly7.eland.multiplethread.touch;
/**
 * 故意设计减血线程频率更高，盖伦的血量迟早会到达1
 * 减血线程中使用while循环判断是否是1，如果是1就不停的循环,直到加血线程回复了血量
 * 这是不好的解决方式，因为会大量占用CPU,拖慢性能
 * @author Administrator
 * 
 * 此处有一个坑:
 * 	在Hero类中的属性上用hp作为一个对比值需要添加一个volatile
 * 
 * 
 * 因为血量到达1后while(gareen.hp==1){continue; }一直为true，也就是减血线程一直在while里，不会执行后面的减血操作。这个涉及到程序的可见性问题，
 * 因为cpu跟内存速度差异大，所以cpu中有寄存器和缓存，增加线程和减少线程在缓存中都有对应的hp，这在java内存模型中也被抽象叫为工作内存，工作内存是线程独有的，
 * 某一时刻才会同步到主内存，所以才会出现减少线程中hp一直为1的情况，尽管增加线程已经给hp加血了，
 * 如果给hero类中hp加上volatile关键字就不会出现只增加的情况，volatile关键保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，
 * 这新值对其他线程来说是立即可见的，对于这个例子来说加了volatile后，增加和减少血量都会同步到主内存，减血线程会去主内存读取，所以不会提问的这个情况，不知道说没说明白。
 *
 */
public class OldMethod {
	public static void main(String[] args) {
		final Hero gareen = new Hero();
		gareen.name = "盖伦";
		gareen.hp = 612;
		
		Thread t1 = new Thread(){
			public void run() {
				while(true) {
					//因为减血更快，所以盖伦的血量迟早会到达1
	                //使用while循环判断是否是1，如果是1就不停的循环
	                //直到加血线程回复了血量
					while (gareen.hp == 1) {
						continue;
					}
					
					gareen.hurt();
					System.out.format("t1 为 %s 减去1滴血, %s 当前血量为%f %n", gareen.name, gareen.name, gareen.hp);
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				while (true) {
					gareen.recover();
					// %0.f的意思就是取值浮点的整数值
					System.out.format("t2 为  %s 加1滴血, %s 当前血量为%f %n", gareen.name, gareen.name, gareen.hp);
					try {
						// 回血的时间一定会比加血的时间慢点
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
	}
}
