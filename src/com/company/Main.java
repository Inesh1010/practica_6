package com.company;

public class Main {

    public static void main(String[] args) {
	    MovableRectangle movableRectangle = new MovableRectangle(5, 15, 3, 4, 6, 12);
        System.out.println(movableRectangle);
        movableRectangle.moveDown();
        movableRectangle.moveLeft();
        System.out.println(movableRectangle);
        System.out.println(movableRectangle.checkSpeed());
    }
}
