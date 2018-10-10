package com.stly7.eland.multiplethread.adugen;
/**
 *  1.先判断这个hp是否有学
 * @author Administrator
 *
 */
public class Hero {
	
	public String name;
	public float hp;
	// 掉的血量
	public int damage;
	public Hero() {
		super();
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	// 1.攻击别人的方法
	public void attackHero(Hero h) {
		// TODO Auto-generated method stub
		try {
			// 为了表示攻击需要时间,每次攻击的时候暂停1000毫秒
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		h.hp -= damage;
		System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
		
		if (h.isDead()) {
			System.out.println(h.name + "死了!");
		}
	}
	 
	// 2.任何比较前一定需要有判断进行
	public boolean isDead() {
		return 0 >= hp ? true : false;
	}
	
	// 准备发动波动拳,每3次进行暂停5分钟,这里使用的是死循环进行触发波动拳
	int totalTime = 3;
	public void adugen() {
		while(true){
			for (int i = 0; i < totalTime; i++) {
                System.out.printf("波动拳第%d发%n", i + 1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
			
			System.out.println("开始为时5秒的充能");
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
        h.name = "红仔";
        h.adugen();
 
    }
	
}
