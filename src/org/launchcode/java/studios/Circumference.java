package org.launchcode.java.studios;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by stephen on 2/27/17.
 */

public class Circumference {

    public static void main(String[] args) {
        Double radius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle you want to find the circumference of: ");
        radius = scanner.nextDouble();

        Double circumference = (2 * Math.PI * radius);
        System.out.println("The circumference of the circle with radius " + radius + " is " + circumference);

    }
}