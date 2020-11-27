package com.company;

public class MovableRectangle extends Rectangle implements  Movable {

    private MovablePoint leftUpper;
    private MovablePoint rightDown;

    public boolean checkSpeed() {
        return leftUpper.xSpeed == rightDown.xSpeed && leftUpper.ySpeed == rightDown.ySpeed ;
    }


    public MovableRectangle(int xl, int yl, int xr, int yr, int xSpeed, int ySpeed) {
        super();
        leftUpper = new MovablePoint(xl, yl, xSpeed, ySpeed);
        rightDown = new MovablePoint(xr, yr, xSpeed, ySpeed);
        this.width = rightDown.x - leftUpper.x;
        this.length = leftUpper.y - rightDown.y;
    }

    public MovableRectangle(String color, boolean filled, int xl, int yl, int xr, int yr, int xSpeed, int ySpeed) {
        super(color,filled);

        leftUpper = new MovablePoint(xl, yl, xSpeed, ySpeed);
        rightDown = new MovablePoint(xr, yr, xSpeed, ySpeed);
        this.width = rightDown.x - leftUpper.x;
        this.length = leftUpper.y - rightDown.y;
    }

    @Override
    public void moveUp() {
        leftUpper.moveUp();
        rightDown.moveUp();
    }

    @Override
    public void moveDown() {
        leftUpper.moveDown();
        rightDown.moveDown();
    }

    @Override
    public void moveLeft() {
        leftUpper.moveLeft();
        rightDown.moveLeft();
    }

    @Override
    public void moveRight() {
        leftUpper.moveRight();
        rightDown.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" + "leftUpper=" + leftUpper + ", rightDown=" + rightDown + ", width=" + width +
                ", height=" + length + ", color='" + color + '\'' + ", filled=" + filled + '}';
    }
}
