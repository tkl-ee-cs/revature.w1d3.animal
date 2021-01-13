package com.revature.day03.animals;

public class Cat extends Feline {
	
	private String food = "Fish";
	private int hunger = 0;
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		hunger++;
		return food;
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return "Anywhere";
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Meow";
	}

}
