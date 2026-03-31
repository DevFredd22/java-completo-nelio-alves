package entidades;

import entidades.enuns.A033_Color;

public class A033_Rectangle extends A033_Shape {

	private Double Width;
	private Double Height;

	public A033_Rectangle() { super();}

	public A033_Rectangle(A033_Color color, Double width, Double height) {
		super(color);
		Width = width;
		Height = height;
	}

	public Double getWidth() { return Width; }

	public void setWidth(Double width) { Width = width; }

	public Double getHeight() { return Height; }

	public void setHeight(Double height) { Height = height; }

	@Override
	public double area() {	return Width * Height; } 
	
	
	
	
}
