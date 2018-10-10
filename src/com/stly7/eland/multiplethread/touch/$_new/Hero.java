package com.stly7.eland.multiplethread.touch.$_new;

public class Hero {
	
	public String name;
	public float hp;
	public int damage;
	
	// ��Ѫ����
	public synchronized void recover() {
		
		//if (hp >= 1000){
		// if�ͻ����Ѫ�Ǹ���������,����ֻ�Ǹ�һ��hurt���ʻ�С�ܶ�,Ҳ�����̻߳���
		while(hp >= 1000) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			// �˴�����һ��if�жϻ��ǻ���ֻ�������,�����ж������wait����1-2��ֵ
			/*if (hp >= 1000) {
				try {
					this.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}*/
		}
		
		hp = hp + 1;
		System.out.format("%s ��1��Ѫ, %s ��ǰѪ��Ϊ%f %n", name, name, hp);
		this.notify();
	}
	
	// �ж���Ѫ
	public synchronized void hurt() {
		// ��Ѫ֮�󣬻��ѵȴ����߳�
		//��if��Ϊwhile�������Ѻ󣬻��ظ��鿴hp��ֵ��ֻ��hp����1���Ż�����ִ��
        //if (hp <= 1) {
		while(hp <= 1) {
			try {
				this.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// �˴�����һ��if�жϻ��ǻ���ֻ�������,�����ж������wait����1-2��ֵ
			/*if(hp <= 1) {
				try {
					this.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}*/
		}
		hp = hp - 1;
		System.out.format("%s ��1��Ѫ, %s ��ǰѪ��Ϊ%f %n", name, name, hp);
		this.notify();
	}
	
	// ����
	public void attacHero(Hero h) {
		h.hp -= damage;
		System.out.format("%s ���ڹ���  %s, %s ��Ѫ����� %f %n", name, h.name, h.name, h.hp);
		
		if (isDead()) {
			System.out.println(h.hp + "����...");
		}
	}
	
	// �ж��Ƿ�����
	public boolean isDead() {
		
		return 0 > hp ? true : false;
	}
	
}
