package com.example;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AppTest {
    
    private App app;
    
    @Before
    public void setUp() {
        app = new App();
    }
    
    @Test
    public void testAppExists() {
        assertNotNull("App object should not be null", app);
    }
    
    @Test
    public void testMainMethod() {
        try {
            App.main(new String[]{});
            assertTrue(true);
        } catch (Exception e) {
            fail("Main method threw exception: " + e.getMessage());
        }
    }
    
    @Test
    public void testAddition() {
        assertEquals("2+2 should equal 4", 4, 2 + 2);
    }
    
    @Test
    public void testStringOperations() {
        String str = "Jenkins";
        assertEquals("String length should be 7", 7, str.length());
        assertTrue("String should start with 'J'", str.startsWith("J"));
    }
    
    @Test
    public void testAlwaysPass() {
        assertTrue(true);
    }
}
