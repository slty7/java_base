package com.stly7.eland.lambda;

public class Hero implements Comparable<Hero>{
	public String name;
    public float hp;
         
    public int damage;
         
    public Hero(){
            
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getHp() {
        return hp;
    }
    public void setHp(float hp) {
        this.hp = hp;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public Hero(String name) {
        this.name =name;
    }
    //初始化name,hp,damage的构造方法
    public Hero(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }
	@Override
	public int compareTo(Hero o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
}
