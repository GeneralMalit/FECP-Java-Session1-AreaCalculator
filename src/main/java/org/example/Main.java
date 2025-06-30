package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("=== Area Calculator ===");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.print("Choose a shape (1-3): ");

        int shape = sc.nextInt();
        double area;
        switch(shape){
            case 1: //circle
                System.out.println();
                System.out.print("Enter the radius: ");
                double radius = sc.nextDouble();
                area = calculateCircleArea(radius);
                System.out.printf("Area of the circle: %.2f", area);
                break;
            case 2: //triangle
                System.out.println();
                System.out.print("Enter the base: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height: ");
                double height = sc.nextDouble();
                area = calculateTriangleArea(base, height);
                System.out.printf("Area of the triangle: %.2f", area);
                break;
            case 3: //rectangle
                System.out.println();
                System.out.print("Enter the length: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width: ");
                double width = sc.nextDouble();
                area = calculateRectangleArea(length, width);
                System.out.printf("Area of the rectangle: %.2f", area);
                break;
            default:
                //should not be reached
                System.out.println("Invalid shape, please try again.");
                break;

        }

    }
    public static double calculateCircleArea(double radius){
        return Math.pow(radius, 2) * Math.PI;
    }
    public static double calculateTriangleArea(double base, double height){
        return 0.5 * (base * height);
    }
    public static double calculateRectangleArea(double length, double width){
        return length * width;
    }
}