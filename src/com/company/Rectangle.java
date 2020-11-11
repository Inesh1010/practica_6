package com.company;

public class Rectangle extends Shape {

    protected double width;
    protected double height;

     public Rectangle(){
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(String color, boolean filled) {
         super(color, filled);
         this.width = 0;
         this.height = 0;
    }

    public Rectangle(double width, double height){
       super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color,  filled);
        this.width = width;
        this.height = height;
    }


    public double getWidth(){
         return width;
    }

    public void setWidth(double width) {

         this.width = width;
    }

    public double getHeight() {

         return height;
    }

    public void setHeight(double height) {

         this.height = height;
    }
    @Override
    public double getArea(){

         return width* height;
    }

    public double getPerimetr(){
        return 2*(width + height);
        }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + height +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
