package com.stly7.eland.multiplethread.pool;
/**
 *����һ���龰��ÿ������ִ�е�ʱ�䶼��1��
 *�տ�ʼ�Ǽ��1�������̳߳����������
 *
 *Ȼ����ʱ��Խ��Խ�̣�ִ��������̻߳�û�����ü��������µ����������ˡ�
 *�ͻ�۲쵽�̳߳���������̱߳�������ִ����Щ����
 * @author Administrator
 *
 */
public class TestThread2 {
	public static void main(String[] args) {
		// ����һ���̳߳� 10���߳�
		ThreadPool pool = new ThreadPool();
		int sleep = 1000;
		// ����5������,Ȼ����ӵ��̳߳���.ÿ������ļ��ʱ����1��
		while(true) {
			Runnable task = new Runnable() {
				
				@Override
				public void run() {
					//System.out.println("ִ������");
					 try {
						 Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			};
			pool.add(task);
			try {
				Thread.sleep(sleep);
				sleep = sleep > 100 ? sleep - 100 : sleep;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
