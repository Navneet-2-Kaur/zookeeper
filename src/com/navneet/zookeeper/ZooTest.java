package com.navneet.zookeeper;
//Peer programming with Deven P. 

// Testing classes 
public class ZooTest {

	public static void main(String[] args) {
		// created instance of gorilla class "coco"
		Gorilla coco = new Gorilla();
		// created instance of bat class "buffy"
		Bat buffy = new Bat();
		
		// Gorilla 
		// applying the gorilla class methods 
		coco.throwSomething();
		coco.throwSomething();
		coco.throwSomething();
		
		coco.eatBananas();
		coco.eatBananas();
		
		coco.climb();
		
		coco.displayEnergy();
		
		// Bat 
		//applying the bat class methods
		buffy.attackTown();
		buffy.attackTown();
		buffy.attackTown();
		
		buffy.eatHumans();
		buffy.eatHumans();
		
		buffy.fly();
		buffy.fly();
		
	
		buffy.displayEnergy();
			

	}
	
	

}
