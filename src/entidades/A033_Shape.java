package entidades;

import entidades.enuns.A033_Color;

public abstract class A033_Shape {
	
	private A033_Color color;

	public A033_Shape() {
	}
	
	public A033_Shape(A033_Color color) {
		this.color = color;
	}

	public A033_Color getColor() {
		return color;
	}

	public void setColor(A033_Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
	

}
