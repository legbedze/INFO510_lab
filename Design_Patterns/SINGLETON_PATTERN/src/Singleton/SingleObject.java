/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**  
 * The SingleObject class follows the Singleton Design Pattern, ensuring that   
 * only one instance of this class can exist throughout the application.  
 * This class provides a global point of access to that instance.  
 *   
 * It includes methods to retrieve the instance and display a message. 
 *   
 * @author Prosper  
 * @version 1.0  
 */  
public class SingleObject {
    
    // Static instance of SingleObject, initialized at class loading time.
    private static SingleObject instance=new SingleObject();
    
    private SingleObject(){}
       //private constructor
    /**  
     * Provides the global point of access to the single instance of   
     * SingleObject. This method is static, allowing it to be called   
     * without needing an instance of the class.  
     *   
     * @return the sole instance of SingleObject.  
     */ 
    public static SingleObject getInstance(){
        return instance; // Return the single instance 

    }
    
    /**  
     * Displays a simple message to the console. This method demonstrates   
     * the functionality of the instance, here outputting "Hello World".  
     *   
     * This method does not return any value and serves solely to perform  
     * an output operation. 
     */ 
    public void showMessage(){
        System.out.println("Hello World"); // Output the message
    }
}
