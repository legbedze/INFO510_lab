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
public class Rectangle implements Shape{
    
/** 
 * Draws the rectangle shape by printing a message to the console.  
 *   
 * This method does not take any parameters and does not return any values.  
 *    
 */    
    @Override
    public String draw(){
        System.out.println("Rectangle::draw()");
        return "Rectangle::draw()";
    }
    
}
