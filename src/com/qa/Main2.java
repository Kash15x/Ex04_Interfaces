package com.qa;

public class Main2 {
    public static void main(String[] args) {
        Circle c = new Circle("circle1", "red", 0, 0, 10);
        Circle c2 = new Circle("circle2", "blue", 10, 10, 5);

        //print out the circle objects
        System.out.println(c);
        System.out.println(c2);

        System.out.println(c + ", CentrePoint is: " +
                c.getCentrePoint() + ", Area is: " + c.getArea());
        System.out.println(c2 + ", CentrePoint is: " +
                c2.getCentrePoint() + ", Area is: " + c2.getArea());

    }

}
