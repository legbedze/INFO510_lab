package FACTORY;

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
     * Draws the shape. The implementation should provide the actual   
     * drawing behavior, which may include rendering the shape to a   
     * graphical context or outputting a description of the shape being drawn.  
     *   
     * This method does not return any value, as it is designed to  
     * perform the drawing action directly. 
     */     
    void draw();
    
}
