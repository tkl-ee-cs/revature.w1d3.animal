package com.revature.day03.animals;

public class Tiger extends Feline {

	private String food = "Prey";
	private int hunger = 0;
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		hunger+=9;
		return food;
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return "Forest";
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Roawr";
	}
}
