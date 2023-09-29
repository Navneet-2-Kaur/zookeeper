package com.navneet.zookeeper;
//Peer programming with Deven P. 

// sub class gorilla which extends the Mammal  Super class
public class Gorilla extends Mammal {
	
	// three different methods for the gorilla sub class 
	// getting the energy value from the super class and applying it to the gorilla class for all methods
	public void throwSomething(){
		this.energy -= 5;
		System.out.println("Watch out for the flyyyying bannana!" );
	}
	public void eatBananas(){
		this.energy += 10;
		System.out.println("Gorilla just ate and is happy!" );
	}
	public void climb(){
		this.energy -= 10;
		System.out.println("The Gorilla is climbing a tree!" );
	}
	
	
}
