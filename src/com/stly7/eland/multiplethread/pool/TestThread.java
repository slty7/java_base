package com.stly7.eland.multiplethread.pool;
/**
 * ����һ���Զ�����̳߳أ���Ȼ�������ƺͽ�׳�������Ѿ�����˵���̳߳صĹ���ԭ��
 * �����ĸ�����̳߳�������񣬻ῴ���ж����߳���ִ����Щ���� 
 * �߳�7ִ�����������ֻص��������һ����������ʱ���߳�7����ִ���µ�����
 * @author Administrator
 *
 */
public class TestThread {
	public static void main(String[] args) {
		// ����һ���̳߳� 10���߳�
		ThreadPool pool = new ThreadPool();
		
		// ����5������,Ȼ����ӵ��̳߳���.ÿ������ļ��ʱ����1��
		for (int i = 0; i < 5; i++) {
			Runnable task = new Runnable() {
				
				@Override
				public void run() {
					 //System.out.println("ִ������");
                    //��������Ǵ�ӡһ�仰
                    //�����Ƿ����ļ�
                    //������������
				}
			};
			pool.add(task);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
