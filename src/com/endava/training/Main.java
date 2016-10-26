package com.endava.training;

import com.endava.training.examples.A;
import com.endava.training.examples.B;
import com.endava.training.examples.C;
import com.endava.training.examples.ExtendedSimple;
import com.endava.training.shape.impl.Circle;
import com.endava.training.shape.impl.Square;
import com.endava.training.shape.impl.Triangle;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello OOP");
		
		System.out.println("Square:");
		Square square = new Square(3);
		System.out.println("\t" + square.computeArea());
		System.out.println("\t" + square.computePerimeter());
		
		System.out.println("Circle:");
		Circle circle = new Circle(4);
		System.out.println("\t" +circle.computeArea());
		System.out.println("\t" + circle.computePerimeter());
		
		System.out.println("Triangle:");
		Triangle triangle = new Triangle(2,7,5);
		System.out.println("\t" +triangle.computeArea());
		System.out.println("\t" + triangle.computePerimeter());
		
		ExtendedSimple es = new ExtendedSimple(2,5);
		
		A a = new B(); a.f();
		B b = new C(); b.f();
		A aa = new C(); aa.f();
		C c = new C(); c.f();
		A aaa = new A(); aaa.f();
		
		String s1 = "Maria";
		String s2 = "Ioana";
		a.f();
		a.f(s1);
		a.f(s1,s2);
		
		b.f();
		b.f(s1);
		b.f(s1,s2);
		
		c.f();
		c.f(s1);
		c.f(s1,s2);
		
		aa.f();
		aa.f(s1);
		aa.f(s1,s2);
	}

}
