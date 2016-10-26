package com.endava.training.examples;

public class A {

	public void f(){
		System.out.println("Hello from A");
	}
	
	public void f(String s){
		System.out.println("Hello from A - 1 arg: " + s);
	}
	
	public void f(String s1, String s2){
		System.out.println("Hello from A - 2 arg: " + s1 +" " + s2);
	}
}
