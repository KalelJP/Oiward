package ch.poeta.oiward;

import javafx.scene.paint.Color;

public class GeometricForm
{

	private Color backgroundColor;
	private int height;
	private int width;
	private int radius;
	private double positionX;

	private double positionY;
	private static int numberOfShapes;

	public Color getBackgroundColor()
	{
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor)
	{
		this.backgroundColor = backgroundColor;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
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

	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		this.radius = radius;
	}

	public double getPositionX()
	{
		return positionX;
	}

	public void setPositionX(double positionX)
	{
		this.positionX = positionX;
	}

	public double getPositionY()
	{
		return positionY;
	}

	public void setPositionY(double positionY)
	{
		this.positionY = positionY;
	}

}
