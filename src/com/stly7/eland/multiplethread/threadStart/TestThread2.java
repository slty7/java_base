package com.stly7.eland.multiplethread.threadStart;

public class TestThread2 {
	public static void main(String[] args) {
		Hero gareen = new Hero();
	    gareen.name = "¸ÇÂ×";
	    gareen.hp = 616;
	    gareen.damage = 50;

	    Hero teemo = new Hero();
	    teemo.name = "ÌáÄª";
	    teemo.hp = 300;
	    teemo.damage = 30;
	     
	    Hero bh = new Hero();
	    bh.name = "ÉÍ½ğÁÔÈË";
	    bh.hp = 500;
	    bh.damage = 65;
	     
	    Hero leesin = new Hero();
	    leesin.name = "Ã¤É®";
	    leesin.hp = 455;
	    leesin.damage = 80;
	    
	    new KillThread(gareen, teemo).start();
	    new KillThread(bh, leesin).start();
	}
}
