package FACADE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**  
 * Provides a simplified interface for drawing different shapes. The ShapeMaker  
 * class uses composition to manage various Shape objects, such as Circle, Rectangle,  
 * and Square, delegating the drawing responsibility to them. This class demonstrates   
 * the Facade Design Pattern by encapsulating the complexity of shape drawing.  
 *   
 * @author Prosper  
 * @version 1.1  
 */ 
public class ShapeMaker {
    // Shape objects representing different shapes
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    /**  
     * Initializes a new ShapeMaker instance, creating instances of Circle,   
     * Rectangle, and Square to be used for drawing.  
     */ 
    public ShapeMaker() {
        circle= new Circle();
        rectangle=new Rectangle();
        square= new Square();
    }
    
    /**  
     * Draws a Circle by calling the draw method of the Circle instance.  
     *   
     * @return a String representation of the Circle drawing action.  
     */  
    public String drawCircle(){ 
        return circle.draw(); // Delegate to Circle's draw method
    }
    
    /**  
     * Draws a Rectangle by calling the draw method of the Rectangle instance.  
     *   
     * @return a String representation of the Rectangle drawing action.  
     */  
    public String drawRectangle(){
        return rectangle.draw(); // Delegate to Rectangle's draw method     
    } 
    
    /**  
     * Draws a Square by calling the draw method of the Square instance.  
     *   
     * @return a String representation of the Square drawing action.  
     */  
     public String drawSquare(){
       return square.draw(); // Delegate to Square's draw method    
    }
}
