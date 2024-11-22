/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package FACADE;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/* * Test class for the ShapeMaker class.  
 *   
 * This class contains unit tests for the methods of the ShapeMaker class,  
 * validating the correct drawing of different shapes such as Circle,  
 * Rectangle, and Square.  
 *   
 * @author Prosper  
 * @version 1.0  
 */ 
public class ShapeMakerTest {
    
     /**  
     * Default constructor for the ShapeMakerTest class.  
     */ 
    
    public ShapeMakerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of drawCircle method, of class ShapeMaker.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        String expResult= "Circle::draw()";
        String result= instance.drawCircle();
        
        //positive test cases
        assertEquals(expResult,result);
        assertEquals("Circle::draw()", instance.drawCircle());
        
        
        //negative test case
        assertNotEquals("Not Circle",instance.drawCircle());
        assertNotEquals("Rectangle", instance.drawCircle());
        
       
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of drawRectangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        ShapeMaker instance = new ShapeMaker();
        String expResult= "Rectangle::draw()";
        String result=instance.drawRectangle();
        
        //positive test cases
        assertEquals(expResult,result);
        assertEquals("Rectangle::draw()", instance.drawRectangle());
        
        //negative test case
         assertNotEquals("Not Rectangle",instance.drawRectangle());
        assertNotEquals("Circle", instance.drawRectangle());
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of drawSquare method, of class ShapeMaker.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        ShapeMaker instance = new ShapeMaker();
        String expResult= "Square::draw()";
        String result=instance.drawSquare();
        // TODO review the generated test code and remove the default call to fail.
        
         //positive test cases
        assertEquals(expResult,result);
        assertEquals("Square::draw()", instance.drawSquare());
        
        
        //negative test case
         assertNotEquals("Not Square",instance.drawSquare());
        assertNotEquals("Circle", instance.drawSquare());
        
        
       //fail("The test case is a prototype.");
    }
    
}
