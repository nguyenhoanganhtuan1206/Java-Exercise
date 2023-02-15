package com.exercise.basic.oop.Bai1;

public class Circle implements Shape {

    private double radius;
    private Point center;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /* Tính khoảng cách từ điểm x và y đến tâm
     * -> nếu khoảng cách nhỏ hơn tâm thì true
     * -> nếu khoảng cách lớn hơn tâm thì false
     * ct tính khoảng cách sqrt x*x + y*y */

    public boolean contains(Point point) {
        double disX = point.getX() - center.getX();
        double disY = point.getY() - center.getY();
        double distanceXY = Math.sqrt(disX * disX + disY * disY);
        return distanceXY < radius;
    }
}
