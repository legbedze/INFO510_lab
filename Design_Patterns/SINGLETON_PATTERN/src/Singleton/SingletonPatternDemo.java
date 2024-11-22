/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author H_Kofi
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        
        SingleObject object= SingleObject.getInstance();
        
        object.showMessage();
        
    }
}
