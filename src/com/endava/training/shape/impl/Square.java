package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

public class Square implements Shape2D{

	public double side;
	
	public Square(){
		super();
	}
	
	public Square(double side){
		super();
		this.side = side;
	}
	
	@Override
	public double computeArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double computePerimeter() {
		return side * 4;
	}

}
