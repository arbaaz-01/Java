package com.arbaaz.shape;

public class Square {

    int side;
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    public void area(){
        System.out.println("Area of Square: "+(side*side)+" sq unit");
    }
    public void perimeter(){
        System.out.println("Perimeter of Square: "+(4 * side)+" unit");
    }
    
}
