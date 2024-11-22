package FACADE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Demonstrates the use of the Facade design pattern for creating different shapes.  
 * 
 * @author Prosper
 * @version 1.1
 */
public class FacadePattern_Demo {
    
 /**  
  * The entry point of the application. It creates a ShapeMaker instance   
  * and uses it to draw various shapes: Circle and Rectangle.  
  * 
  */
    public static void main(String[] args) {
        ShapeMaker shapeMaker= new ShapeMaker();
        
        // Draw a Circle using the ShapeMaker 
        shapeMaker.drawCircle();
        
        // Draw a Rectangle using the ShapeMaker 
        shapeMaker.drawRectangle();
        
        // Draw another Circle
        shapeMaker.drawCircle();
    }
}
