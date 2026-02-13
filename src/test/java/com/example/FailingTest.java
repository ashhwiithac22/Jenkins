package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FailingTest {
    
    @Test
    public void testThatWillPass() {
        assertEquals("This should pass", 4, 2 + 2);
    }
    
    @Test
    public void testThatWillFail() {
        // THIS WILL FAIL - intentionally wrong
        assertEquals("This should fail - demonstrating quality gate", 
                     5,     // Wrong expected value
                     2 + 2  // Actual = 4
        );
    }
}
