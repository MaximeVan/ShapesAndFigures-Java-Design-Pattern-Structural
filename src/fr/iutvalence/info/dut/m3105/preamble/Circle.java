package fr.iutvalence.info.dut.m3105.preamble;

public class Circle extends Shape
{
	private int radius;

	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		this.radius = radius;
	}

	public Circle(int radius)
	{
		super();
		this.radius = radius;
	}

	public String toString()
	{
		return "circle ( radius = " + this.radius + " )";
	}
}
