package com.stly7.eland.multiplethread.touch;
/**
 * ������Ƽ�Ѫ�߳�Ƶ�ʸ��ߣ����׵�Ѫ������ᵽ��1
 * ��Ѫ�߳���ʹ��whileѭ���ж��Ƿ���1�������1�Ͳ�ͣ��ѭ��,ֱ����Ѫ�̻߳ظ���Ѫ��
 * ���ǲ��õĽ����ʽ����Ϊ�����ռ��CPU,��������
 * @author Administrator
 * 
 * �˴���һ����:
 * 	��Hero���е���������hp��Ϊһ���Ա�ֵ��Ҫ���һ��volatile
 * 
 * 
 * ��ΪѪ������1��while(gareen.hp==1){continue; }һֱΪtrue��Ҳ���Ǽ�Ѫ�߳�һֱ��while�����ִ�к���ļ�Ѫ����������漰������Ŀɼ������⣬
 * ��Ϊcpu���ڴ��ٶȲ��������cpu���мĴ����ͻ��棬�����̺߳ͼ����߳��ڻ����ж��ж�Ӧ��hp������java�ڴ�ģ����Ҳ�������Ϊ�����ڴ棬�����ڴ����̶߳��еģ�
 * ĳһʱ�̲Ż�ͬ�������ڴ棬���ԲŻ���ּ����߳���hpһֱΪ1����������������߳��Ѿ���hp��Ѫ�ˣ�
 * �����hero����hp����volatile�ؼ��־Ͳ������ֻ���ӵ������volatile�ؼ���֤�˲�ͬ�̶߳�����������в���ʱ�Ŀɼ��ԣ���һ���߳��޸���ĳ��������ֵ��
 * ����ֵ�������߳���˵�������ɼ��ģ��������������˵����volatile�����Ӻͼ���Ѫ������ͬ�������ڴ棬��Ѫ�̻߳�ȥ���ڴ��ȡ�����Բ������ʵ�����������֪��˵û˵���ס�
 *
 */
public class OldMethod {
	public static void main(String[] args) {
		final Hero gareen = new Hero();
		gareen.name = "����";
		gareen.hp = 612;
		
		Thread t1 = new Thread(){
			public void run() {
				while(true) {
					//��Ϊ��Ѫ���죬���Ը��׵�Ѫ������ᵽ��1
	                //ʹ��whileѭ���ж��Ƿ���1�������1�Ͳ�ͣ��ѭ��
	                //ֱ����Ѫ�̻߳ظ���Ѫ��
					while (gareen.hp == 1) {
						continue;
					}
					
					gareen.hurt();
					System.out.format("t1 Ϊ %s ��ȥ1��Ѫ, %s ��ǰѪ��Ϊ%f %n", gareen.name, gareen.name, gareen.hp);
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
					// %0.f����˼����ȡֵ���������ֵ
					System.out.format("t2 Ϊ  %s ��1��Ѫ, %s ��ǰѪ��Ϊ%f %n", gareen.name, gareen.name, gareen.hp);
					try {
						// ��Ѫ��ʱ��һ����ȼ�Ѫ��ʱ������
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
