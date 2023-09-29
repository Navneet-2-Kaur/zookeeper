package com.navneet.zookeeper;

// Peer programming with Deven P. 

// Mammal Super class
public class Mammal {
	// field or member variable is energy 
	protected int energy;
	
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	// Mammal method with a default energy level of 100
	public Mammal() {
		// default energy level of the created mammal 
		this.energy = 100;
	}
	public Mammal(int energy) {
		this.energy = energy;
	}
	// for displaying info use void 
	public void displayEnergy()
	{
		System.out.println("The animals current energy level is " +energy);
	}
}

