package com.endava.training.examples;

public class ExtendedSimple extends Simple{

	public ExtendedSimple(){
		super();
		System.out.println("Hello from constructor with 0 args");
	}
	
	public ExtendedSimple(int a){
		super();
		System.out.println("Hello from constructor with 1 args");
	}
	
	public ExtendedSimple(int a, int b){
		super();
		System.out.println("Hello from constructor with 2 args");
	}
	
}
