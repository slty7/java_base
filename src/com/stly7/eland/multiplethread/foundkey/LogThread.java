package com.stly7.eland.multiplethread.foundkey;

import java.util.List;

public class LogThread extends Thread {
	 private boolean found = false;
	 
	    private List<String> passwords;
	 
	    public LogThread(List<String> passwords) {
	        this.passwords = passwords;
	         
	        this.setDaemon(true);//�Ѽ���־������̣߳�����Ϊ�ػ��߳�
	    }
	     
	    public void run(){
	        while(true){
	            while(passwords.isEmpty()){
	                try {
	                    Thread.sleep(50);
	                } catch (InterruptedException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
	             
	            String password = passwords.remove(0);
	            System.out.println("��ٷ��������ɵ������ǣ�" +password);
	        }
	    }
}
