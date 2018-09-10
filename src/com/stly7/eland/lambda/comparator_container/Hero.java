package com.stly7.eland.lambda.comparator_container;

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
    
    public int comparatorHero(Hero anotherHero) {
    	
    	return hp >= anotherHero.hp ? 1 : -1;
    }
}
