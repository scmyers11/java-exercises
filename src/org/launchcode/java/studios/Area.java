package org.launchcode.java.studios;

import java.util.Scanner;
import java.lang.Math;

/**
 * Created by stephen on 2/27/17.
 */
public class Area {

    public static void main(String[] args) {
        double radius;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the radius: ");
            radius = scanner.nextDouble();
        }while(radius < 0);

        System.out.println("The area is " + (Math.PI * radius * radius));
    }
}
