/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabonacci;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.*;
import static org.junit.Assert.*;

/**
 *
 * @author rbnra
 */
public class FabonacciTest extends TestCase {
    protected int value1, value2;
    
    public FabonacciTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    protected void setUp() {
        value1 = 3;
        value2 = 3;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Fabonacci.
     */
    @Test
    public void testAdd() {
        double result = value1 + value2;
        assertTrue(result == 6);
    }
    /*public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fabonacci.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    public void testFabonacci() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine", str);
    }
    
}
