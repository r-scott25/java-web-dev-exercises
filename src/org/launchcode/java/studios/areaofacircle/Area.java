package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter a radius: ");

double radius = input.nextDouble();
while (radius < 0) {
    System.out.println("You're a bad boy!");
    System.out.println("Enter a radius: ");
    radius = input.nextDouble();
}
input.close();

double result = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + result);

    }
}
