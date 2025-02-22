/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Rectangle {
    private double length, width;
    
    public Rectangle(double length,double width){
        this.length =length;
        this.width= width;
    }
    
   
    double getPerimeter(){
        return 2 * (length + width);
    }
    
    
    double getArea(){
        return length * width;
    }
}
