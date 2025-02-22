/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Square {
    private double side;
    
    public Square(double side){
        this.side= side;
        
    }
   
    double getPerimeter(){
        return 4* side;
    }
    
    double getArea(){
        return side * side;
    }
}
