package FACTORY;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Factory class for creating shape objects. This class implements the Factory Design Pattern,  
 * providing a method to obtain instances of various shapes based on the input type. 
 * 
 * @author Prosper
 * @version 1.1
 */
public class ShapeFactory {
    // Use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null; // Return null if the shape is null
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle(); // Create and return a Circle object
            
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle(); // Create and return a Rectangle object
            
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square(); // Create and return a Square object
        }
        return null; // Return null if no valid shape type is found
        }
    
}
