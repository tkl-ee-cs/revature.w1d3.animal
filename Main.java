package com.revature.day03.animals;

public class Main {
	public static void main(String[] args) {
		Feline f0 = new Cat();
		Feline f1 = new Lion();
		Feline f2 = new Tiger();
		
		Canine c0 = new Dog();
		Canine c1 = new Wolf();
		
		System.out.println("Meal time....");
		System.out.println(f0.eat());
		System.out.println(f1.eat());
		System.out.println(f2.eat());
		System.out.println(c0.eat());
		System.out.println(c1.eat());
		
		System.out.println("\nBedtime....");
		System.out.println(f0.sleep());
		System.out.println(f1.sleep());
		System.out.println(f2.sleep());
		System.out.println(c0.sleep());
		System.out.println(c1.sleep());
		
		System.out.println("\nTravelling....");
		System.out.println(f0.roam());
		System.out.println(f1.roam());
		System.out.println(f2.roam());
		System.out.println(c0.roam());
		System.out.println(c1.roam());
		
		System.out.println("\nI hear a noise....");
		System.out.println(f0.makeNoise());
		System.out.println(f1.makeNoise());
		System.out.println(f2.makeNoise());
		System.out.println(c0.makeNoise());
		System.out.println(c1.makeNoise());
	}
}
