package com.revature.day03.animals;

public class Dog extends Canine {
	
	private String food = "Bone";
	private int hunger = 0;
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		hunger+=2;
		return food;
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return "Dog house";
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Woof";
	}

}
