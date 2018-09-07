package com.stly7.eland.collection.compara.comparator;

public class Hero_comparator {
	public String name;
    public float hp;
  
    public int damage;
  
    public Hero_comparator() {
  
    }
  
    public Hero_comparator(String name) {
 
        this.name = name;
    }
  
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + ", damage=" + damage + "]\r\n";
    }
 
    public Hero_comparator(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
}
