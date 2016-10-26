package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

public class Circle implements Shape2D{

	public static final double PI = 3.14159;
	public double radius;
	
	public Circle(){
		super();
	}
	
	public Circle(double radius){
		super();
		this.radius = radius;
	}
	
	@Override
	public double computeArea(){
		return PI * Math.pow(this.radius, 2);
	}
	
	@Override
	public double computePerimeter(){
		return 2 * PI * this.radius;
	}
}
