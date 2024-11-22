package FACADE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**  
 * Interface representing a geometric shape. All shape classes should   
 * implement this interface, providing a specific implementation of the  
 * draw method. This promotes a consistent contract for drawing shapes   
 * while allowing for polymorphic behavior in shape utilization.  
 *   
 * @author Prosper  
 * @version 1.1  
 */  
public interface Shape {
    
 /**  
  * Draws the shape and returns a String representation of the drawing action.  
  *   
  * @return a String describing the action of drawing the shape.  
  */     
    String draw();
    
}
