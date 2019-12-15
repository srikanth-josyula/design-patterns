package com.sample.structural.flyweight;

import com.sample.structural.flyweight.factory.PenFactory;
import com.sample.structural.flyweight.service.Pen;

public class PaintBrushClient {
	public static void main(String[] args) {
		Pen yellowThinPen1 = PenFactory.getThickPen("YELLOW"); // created new pen 2018699554      //same object
		yellowThinPen1.draw("Hello World !!");

		Pen yellowThinPen2 = PenFactory.getThickPen("YELLOW"); // pen is shared 2018699554      //same object
		yellowThinPen2.draw("Hello World !!");

		Pen blueThinPen = PenFactory.getThickPen("BLUE"); // created new pen 1311053135
		blueThinPen.draw("Hello World !!");

		System.out.println(yellowThinPen1.hashCode());
		System.out.println(yellowThinPen2.hashCode());

		System.out.println(blueThinPen.hashCode());
	}
}
