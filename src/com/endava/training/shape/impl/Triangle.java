package com.endava.training.shape.impl;

import java.util.Arrays;

import com.endava.training.shape.Shape2D;

public class Triangle implements Shape2D {

	public double vertice1;
	public double vertice2;
	public double vertice3;

	public Triangle() {
		super();
	}

	public Triangle(double vertice1, double vertice2, double vertice3) {
		super();
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}

	public boolean exists() {
		double[] order = { this.vertice1, this.vertice2, this.vertice3 };
		Arrays.sort(order);
		if(order[0] + order[1] >= order[2])
			return true;
		else {
			System.out.println("nu se poate forma un triunghi cu laturile " + this.vertice1 + " " + this.vertice2 + " "
					+ this.vertice3);
			return false;
		}
	}

	@Override
	public double computeArea() {
		if (this.exists()) {
			double p = this.computePerimeter() / 2.0;
			return Math.sqrt(p * (p - this.vertice1) * (p - this.vertice2) * (p - this.vertice3));
		} else
			return 0;
	}

	@Override
	public double computePerimeter() {
		if (this.exists())
			return this.vertice1 + this.vertice2 + this.vertice3;
		else
			return 0;
	}

}
