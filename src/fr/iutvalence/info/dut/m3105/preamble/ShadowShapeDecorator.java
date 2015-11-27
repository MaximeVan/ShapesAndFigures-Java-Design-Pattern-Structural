package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowShapeDecorator extends ShapeDecorator
{
	int angle;
	int intensity;
	
	public ShadowShapeDecorator(int angle, int intencity)
	{
		super();
		this.angle = angle;
		this.intensity = intencity;
	}

}
