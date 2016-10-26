package com.endava.training.examples;

public class B extends A{

	public void f(){
		System.out.println("Hello from B");
	}
	
	@Override
	public void f(String s){
		System.out.println("Hello from B - 1 arg: " + s);
	}
	
	@Override
	public void f(String s1, String s2){
		System.out.println("Hello from B - 2 arg: " + s1 +" " + s2);
	}
}
