package FACTORY;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the ShapeFactory and Shape implementations.
 *
 * This class contains unit tests for the ShapeFactory methods, ensuring
 * that the correct shape objects are created and their draw methods work as expected.
 *
 * @author Prosper
 * @version 1.1
 */
public class ShapeFactoryTest {

    private ShapeFactory shapeFactory;

    @Before
    public void setUp() {
        shapeFactory = new ShapeFactory(); // Initialize ShapeFactory before each test
    }

    @After
    public void tearDown() {
        shapeFactory = null; // Clean up after each test
    }

    /**
     * Test of getShape method for creating a Circle.
     */
    @Test
    public void testGetShape_Circle() {
        System.out.println("getShape_Circle");
        Shape shape = shapeFactory.getShape("CIRCLE");

        // Assert that the shape is an instance of Circle
        assertNotNull("Shape should not be null", shape);
        assertTrue("Shape should be an instance of Circle", shape instanceof Circle);

        // Test the draw method
        shape.draw();
    }

    /**
     * Test of getShape method for creating a Rectangle.
     */
    @Test
    public void testGetShape_Rectangle() {
        System.out.println("getShape_Rectangle");
        Shape shape = shapeFactory.getShape("RECTANGLE");

        // Assert that the shape is an instance of Rectangle
        assertNotNull("Shape should not be null", shape);
        assertTrue("Shape should be an instance of Rectangle", shape instanceof Rectangle);

        // Test the draw method
        shape.draw();
    }

    /**
     * Test of getShape method for creating a Square.
     */
    @Test
    public void testGetShape_Square() {
        System.out.println("getShape_Square");
        Shape shape = shapeFactory.getShape("SQUARE");

        // Assert that the shape is an instance of Square
        assertNotNull("Shape should not be null", shape);
        assertTrue("Shape should be an instance of Square", shape instanceof Square);

        // Test the draw method
        shape.draw();
    }

    /**
     * Test of getShape method with an invalid shape type.
     */
    @Test
    public void testGetShape_InvalidShape() {
        System.out.println("getShape_InvalidShape");
        Shape shape = shapeFactory.getShape("TRIANGLE");

        // Assert that the shape is null for an invalid input
        assertNull("Shape should be null for an invalid shape type", shape);
    }

    /**
     * Test of getShape method with null input.
     */
    @Test
    public void testGetShape_NullInput() {
        System.out.println("getShape_NullInput");
        Shape shape = shapeFactory.getShape(null);

        // Assert that the shape is null for null input
        assertNull("Shape should be null for null input", shape);
    }
}
