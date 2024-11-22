package FACTORY;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Demonstrates the use of the Factory design pattern for creating different shapes.  
 * This class creates instances of shapes (Circle, Rectangle, and Square) using   
 * the ShapeFactory and calls their respective draw methods. 
 * 
 * @author Prosper
 * @version 1.1
 */
public class FactoryPatternDemo {
 /**
  * It creates a ShapeFactory instance and   
  * retrieves various shape objects, invoking their draw methods to demonstrate  
  * the Factory design pattern.  
  * 
  * @param args 
  */
    public static void main(String[] args){
        ShapeFactory shapeFactory=new ShapeFactory();
        
        //get an object of Circle and call its draw method.
        Shape shape1=shapeFactory.getShape("CIRCLE");
        
        //call draw method of Circle
        shape1.draw();
        
        //get an object of Rectangle and call its draw method.
        Shape shape2=shapeFactory.getShape("RECTANGLE");
        
        //call draw method of Rectangle
        shape2.draw();
        
        //get an object of Square and call its draw method.
        Shape shape3=shapeFactory.getShape("SQUARE");
        
        //call draw method of Square
        shape3.draw();  
        
    }
    
}
