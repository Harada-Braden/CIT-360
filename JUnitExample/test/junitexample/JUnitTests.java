/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitexample;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lil_ninja88
 */
public class JUnitTests {
    
    public JUnitTests() {
    }

    /**
     * Test of sum method, of class JUnit.
     */
    @Test
    public void testSum() {
        int value = JUnit.sum("8","3");
        assertEquals(value, 11);
    }
    
    @Test
    public void testSum1() {
    	int val = JUnit.sum("a","5");
        assertEquals(val, 0);
    }
    
    @Test
    public void testSum2() {
    	int val = JUnit.sum("6","b");
        assertEquals(val, 0);
    }
    
    @Test
    public void testSum3() {
    	int val = JUnit.sum("c","d");
        assertEquals(val, 0);
    }

    /**
     * Test of subtract method, of class JUnit.
     */
    @Test
    public void testSubtract() {
    	int value = JUnit.subtract("15","9");
        assertEquals(value,6);
    }
    
    public void testSubtract1() {
    	int value = JUnit.subtract("a","15");
        assertEquals(value,0);
    }
    
    public void testSubtract2() {
    	int value = JUnit.subtract("9","b");
        assertEquals(value,0);
    }
    
    public void testSubtract3() {
    	int value = JUnit.subtract("c","d");
        assertEquals(value,0);
    }

    /**
     * Test of multiply method, of class JUnit.
     */
    @Test
    public void testMultiply() {
        int value = JUnit.multiply("3","5");
        assertEquals(value,15);
    }
    
    @Test
    public void testMultiply1() {
    	int value = JUnit.multiply("a","9");
    	assertEquals(value,0);
    }
    
    @Test
    public void testMultiply2() {
    	int value = JUnit.multiply("8","b");
    	assertEquals(value,0);
    }
    
    @Test
    public void testMultiply3() {
    	int value = JUnit.multiply("c","d");
    	assertEquals(value,0);
    }

    /**
     * Test of divide method, of class JUnit.
     */
    @Test
    public void testDivide() {
        int value = JUnit.divide("18","6");
        assertEquals(value,3);
    }
    
    @Test
    public void testDivide1() {
    	int value = JUnit.divide("a","1");
        assertEquals(value,0);
    }
    
    @Test
    public void testDivide2() {
    	int value = JUnit.divide("62","b");
        assertEquals(value,0);
    }
	
    @Test
    public void testDivide3() {
    	int value = JUnit.divide("d","c");
        assertEquals(value,0);
    }

    /**
     * Test of divideByZero method, of class JUnit.
     */
    @Test
    public void testDivideByZero() {
        int value = JUnit.divide("6","0");
        assertEquals(value,0);
    }
    
    @Test
    public void testDivideByZero1() {
        int value = JUnit.divide("0","6");
        assertEquals(value,1);
    }
    
    @Test
    public void testDivideByZeroTrue() {
    	boolean value = JUnit.divideByZero(1);
        assertTrue(value);
    }
    
    @Test
    public void testDivideByZeroFalse() {
    	boolean value = JUnit.divideByZero(0);
        assertFalse(value);
    }

    /**
     * Test of intTest method, of class JUnit.
     */
    @Test
    public void testIntTest() {
    	boolean value = JUnit.intTest("6");
        assertTrue(value);
    }
    
    @Test
    public void testCheckIntFalse() {
    	boolean value = JUnit.intTest("a");
        assertFalse(value);
    }
    
    /**
     * Test of String method, of class JUnit.
     */
    @Test
    public void testAssertNotNull() {
    	String A = "This is only a Test.";
    	assertNotNull(JUnit.string(A));
    }
	
    @Test
    public void testAssertNull() {
    	String A = null;
    	assertNull(JUnit.string(A));
    }

    /**
     * Test of array method, of class JUnit.
     */
    @Test
    public void testArray() {
        Integer[] testArray = {2,4,6,8};
	assertArrayEquals(testArray, JUnit.array(testArray));
    }
    
    @Test
    public void testNotSame() {
    	int value = JUnit.sum("10","3");
        assertNotSame(value, 13);
    }

    @Test
    public void testAssertSame() {
    	int value = JUnit.sum("5","8");
        assertSame(value, 13);
    }
    
    @Test
    public void testAssertThat() {
    	int value = JUnit.sum("12","7");
        assertThat(value, is (equalTo(19)));
    }
}
