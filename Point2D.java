package com.app.geometry;

public class Point2D {
	private int x;
	private int y;
	public Point2D() {
		//TODO
	}
	public Point2D(int x,int y){
		this.x = x;
		this.y = y;
		
	}
	public int getX() {
		return x;
		
	}
	public int getY() {
		return y;
		
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public boolean isEqual(Point2D anotherPoint) {
	    return this.x == anotherPoint.x && this.y == anotherPoint.y;
	}
	public double calculateDistance(Point2D anotherPoint) {
	    int dx = this.x - anotherPoint.x;
	    int dy = this.y - anotherPoint.y;
	    return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}
	public String getDetails() {
		return "("+x+","+y+")";
	}
		
	}