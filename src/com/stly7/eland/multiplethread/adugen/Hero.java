package com.stly7.eland.multiplethread.adugen;
/**
 *  1.���ж����hp�Ƿ���ѧ
 * @author Administrator
 *
 */
public class Hero {
	
	public String name;
	public float hp;
	// ����Ѫ��
	public int damage;
	public Hero() {
		super();
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	// 1.�������˵ķ���
	public void attackHero(Hero h) {
		// TODO Auto-generated method stub
		try {
			// Ϊ�˱�ʾ������Ҫʱ��,ÿ�ι�����ʱ����ͣ1000����
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		h.hp -= damage;
		System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n", name, h.name, h.name, h.hp);
		
		if (h.isDead()) {
			System.out.println(h.name + "����!");
		}
	}
	 
	// 2.�καȽ�ǰһ����Ҫ���жϽ���
	public boolean isDead() {
		return 0 >= hp ? true : false;
	}
	
	// ׼����������ȭ,ÿ3�ν�����ͣ5����,����ʹ�õ�����ѭ�����д�������ȭ
	int totalTime = 3;
	public void adugen() {
		while(true){
			for (int i = 0; i < totalTime; i++) {
                System.out.printf("����ȭ��%d��%n", i + 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
			
			System.out.println("��ʼΪʱ5��ĳ���");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
		}
	}
	public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "����";
        h.adugen();
 
    }
	
}
