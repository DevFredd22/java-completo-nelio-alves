package entidades;

import entidades.enuns.A033_Color;

public  class A033_Circle extends A033_Shape {
	
private Double Radius;

public A033_Circle() { super(); }

public A033_Circle(A033_Color color, Double radius) {
	super(color);
	Radius = radius;
}

public Double getRadius() {
	return Radius;
}

public void setRadius(Double radius) {
	Radius = radius;
}

@Override
public double area() {
	return Math.PI* Radius * Radius;
}





	
}
