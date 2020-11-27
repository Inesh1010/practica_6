package com.company;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

     public Rectangle(){
        super();
        width = 0;
         length = 0;
    }

    public Rectangle(String color, boolean filled) {
         super(color, filled);
         this.width = 0;
         this.length = 0;
    }

    public Rectangle(double width, double length){
       super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color,  filled);
        this.width = width;
        this.length = length;
    }


    public double getWidth(){
         return width;
    }

    public void setWidth(double width) {

         this.width = width;
    }

    public double getHeight() {

         return length;
    }

    public void setLength(double height) {

         this.length = height;
    }
    @Override
    public double getArea(){

         return width* length;
    }

    public double getPerimetr(){
        return 2*(width + length);
        }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
