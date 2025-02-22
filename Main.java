/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
 

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter side of square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        System.out.println("Square Perimeter:" + square.getPerimeter());
        System.out.println("Square Area:" + square.getArea());
        
        System.out.println("\nEnter width of rectangle");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Perimeter:" + rectangle.getPerimeter());
        System.out.println("Rectangle Area:" + rectangle.getArea());
        
        System.out.println("\nEnter side a of triangle");
        double a = scanner.nextDouble();
        System.out.println("\nEnter side b of triangle");
        double b = scanner.nextDouble();
        System.out.println("\nEnter side c of triangle");
        double c = scanner.nextDouble();
        Triangle triangle = new Triangle (a,b,c);
        System.out.println("Triangle Perimeter:" + triangle.getPerimeter());
        System.out.println("Triangle Area:" + triangle.getArea());
        
        scanner.close();
        
    }
    
}
