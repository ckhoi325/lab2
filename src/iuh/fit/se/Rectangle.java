/*
*@ (#) Rectangle.java		1.0 Aug 29, 2024
*
*Copyright (c) 2024 IUH. All rights reserved
*/
package iuh.fit.se;



/*
*@description:
*@author: Chu Anh Khoi
*@date: Aug 29, 2024
*version: 1.0
*/
public class Rectangle {
	private double length;
	private double width;

	
	
	public Rectangle() {
		this(0.0,0.0);
	}
	
	public Rectangle(double length, double width) {
		this.length= length;
		this.width= width;
		if(length <0 || width <0 )
			throw new IllegalArgumentException("length and width must greater than 0");
	}

	
	public void setLength(double length) {
		if(length<0)
			throw new IllegalArgumentException("Length must be greater than 0");
		this.length=length;
		
	}
	public double getLength() {
		return length;
		
	}
	public void setWidth(double width) {
		if(width<0)
			throw new IllegalArgumentException("Width must be greater than 0");
		this.width=width;
	}
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return this.length*this.width*3.14;
	}

	public double getPerimeter() {
		return (this.length+this.width)*2;
	}
	@Override
	public String toString() {
		return String.format("%10.2f%10.2f%10.2f%10.2f",length,width,getArea(),getPerimeter());
	}
	
}
