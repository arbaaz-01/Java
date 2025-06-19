/*
You have to create a package named com.arbaz.shape
This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
These classes should use inheritance to properly manage the code!
Include methods like volume, surface area, and getters/setters for dimensions
*/

package com.arbaz.shape

class Square{
	int length;
	public void setLen(int l){
		this.lenght = l;
	}
	
	public int getL(){
		return this.length;
	}
	public int area(){
		System.out.println(this.length * this.length);
		return this.length * this.length;
	}
	public void perimeter(){
		System.out.println(4 * this.length);
	}
}
class Rectangle extends Square{
	int width;
	private int length = sq.getL();
	public void setLW(int l, int w){
		
		