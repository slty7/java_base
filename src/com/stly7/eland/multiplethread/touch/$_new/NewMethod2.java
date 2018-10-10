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
public class NewMethod2 {
	
	public static void main(String[] args) {
		final Hero gareen = new Hero();
		gareen.name = "����";
		gareen.hp = 612;
		
		for (int i = 0; i < 2; i++) {
            new RecoverThread(gareen).start();
        }
        for (int i = 0; i < 5; i++) {
            new HurtThread(gareen).start();
        }
		
		
	}
	
	static class RecoverThread extends Thread {
		public Hero h;
		public RecoverThread(Hero h) {
			super();
			this.h = h;
		}


		public void run() {
			while (true) {
				h.recover();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class HurtThread extends Thread {
		public Hero h;
		public HurtThread(Hero h) {
			super();
			this.h = h;
		}


		public void run() {
			while (true) {
				h.hurt();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
