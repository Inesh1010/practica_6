package com.company;

public class Main {

    public static void main(String[] args) {
	MovableRectangle movableRectangle = new MovableRectangle(-2, 10, 5, 7, 5, 9);
        System.out.println(movableRectangle);
        movableRectangle.moveDown();
        movableRectangle.moveLeft();
        System.out.println(movableRectangle);
        System.out.println(movableRectangle.checkSpeed());
    }
}
