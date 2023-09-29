package com.navneet.zookeeper;
//Peer programming with Deven P. 
public class Bat extends Mammal {
	public Bat() {
		// default energy level of the created bat // over rides the Super class "Mammals default energy of 100
		super(300);
	}
	public void fly(){
		this.energy -= 50;
		System.out.println("The bat is in the sky! Watch out!" );
	}
	public void eatHumans(){
		this.energy += 25;
		System.out.println("The bat just murdered someone and is happy." );
	}
	public void attackTown(){
		this.energy -= 100;
		System.out.println("The bat is attacking the town!" );
	}
}
