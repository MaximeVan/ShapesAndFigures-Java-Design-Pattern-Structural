package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle extends Shape
{
	private int width;
	public Rectangle(int width, int height)
	{
		super();
		this.width = width;
		this.height = height;
	}
	public int getWidth()
	{
		return width;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	private int height;
	
	public String toString()
	{
		return "rectangle ( height = " + this.height + " , " + "width = " + this.width + " )";
	}

}
