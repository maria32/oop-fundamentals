package com.endava.training.examples;

public class C extends B{

	public void f(){
		System.out.println("Hello from C");
	}
	
	@Override
	public void f(String s){
		System.out.println("Hello from C - 1 arg: " + s);
	}
	
	@Override
	public void f(String s1, String s2){
		System.out.println("Hello from C - 2 arg: " + s1 +" " + s2);
	}
}
