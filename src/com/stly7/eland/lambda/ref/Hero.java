package com.stly7.eland.lambda.ref;

public class Hero {
	public String name;
    public float hp;
  
    public int damage;
  
    public Hero() {
  
    }
  
    public Hero(String name) {
 
        this.name = name;
    }
  
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
 
    public Hero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    
    
    // ���������еĶ���ķ���
    public boolean matched(){
	   return this.hp>100 && this.damage<50;
    }
}