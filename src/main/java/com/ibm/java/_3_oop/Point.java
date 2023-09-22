package com.ibm.java._3_oop;

//fields: coordinates x and y
//methods: computeDistance(x, y) -> √(x1-x2)^2 + (y1-y2)^2
//methods: computeDistance(Point other) -> √(x1-x2)^2 + (y1-y2)^2
public class Point {
	
	double x;
	double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double computeDistance(double x, double y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}
	
	public double computeDistance(Point other) {
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}
	
	public static void main(String[] args) {
		Point first = new Point(1,1);
		Point second = new Point(2,1);
		System.out.println("first.computeDistance(second) = " + first.computeDistance(second));
		System.out.println("second.computeDistance(2, 4) = " + second.computeDistance(2, 4));
		
		
		
	}
}
