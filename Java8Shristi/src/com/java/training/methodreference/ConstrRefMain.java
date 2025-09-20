package com.java.training.methodreference;

public class ConstrRefMain {

	public static void main(String[] args) {
		//annonymous inner class
		IShapeFactory factory=new IShapeFactory() {

			@Override
			public Shape getShape() {
				return new Shape();
			}
		};
		Shape shape=factory.getShape();
		shape.area(5, 2);

		System.out.println();
		//lambda expression
		factory=()->new Shape();
		shape=factory.getShape();
		shape.area(4, 4);
		
		System.out.println();
		//Constructor Method reference
		factory=Shape::new;
		shape =factory.getShape();
		shape.area(5, 6);
	}

}
