package FACADE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Prosper
 * @version 1.1
 */
public class Square implements Shape{
    
/** 
  * Draws the square shape by printing a message to the console.  
  *   
  * This method does not take any parameters and does not return any values.  
  *    
  */          
    @Override
    public String draw(){
        System.out.println("Square::draw()");
        return "Square::draw()";
}
    
}
