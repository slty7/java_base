package com.stly7.eland.multiplethread.touch.$_new;
/**
 * �����Ѫ�߳����еø���Ƶ����Ӣ�۵����Ѫ����1000
 * ��Ƽ�Ѫ�̺߳ͼ�Ѫ�̵߳Ľ������û�Ѫ����֮�󣬼�Ѫ�̵߳ȴ���ֱ���м�Ѫ�̼߳�Ѫ
 * 
 * ��Ҫ�ǳжҵ�wait notify ���÷�
 * 	ע�����ﲻʹ��notifyAll
 * @author Administrator
 *
 */
public class NewMethod {
	
	public static void main(String[] args) {
		final Hero gareen = new Hero();
		gareen.name = "����";
		gareen.hp = 612;
		
		Thread t1 = new Thread(){
			@Override
			public void run() {
				while (true) {
					gareen.hurt();
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				while (true) {
					gareen.recover();
					try {
						Thread.sleep(10);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t2.start();
	}
}
