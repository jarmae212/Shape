/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Triangle {
    
    private double a,b,c;
    
    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    double getPerimeter(){
        return a + b + c;
    }
    
    double getArea(){
        double s = getPerimeter()/2;
        return Math.sqrt(s * (s - a) * (s- b) * (s - c));
    }
    
}
