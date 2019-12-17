/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitexample;

/**
 *
 * @author lil_ninja88
 */


public class JUnit {
    
    static int a;
    static int b;
    
    // This method is for Addition
    public static int sum (String numberA, String numberB) {
        if (intTest(numberA) && intTest(numberB) == true) {
            a = Integer.parseInt(numberA);  
            b = Integer.parseInt(numberB);
            return a + b;
        } else {
            return 0;
        }	
    }
    
    // This method is for Subtraction
    public static int subtract (String numberA, String numberB) {
    	if (intTest(numberA) && intTest(numberB) == true) {
            a = Integer.parseInt(numberA);  
            b = Integer.parseInt(numberB);
            return a - b;
        } else {
            return 0;
        }	
    }
    
    // This method is for Multiplication
    public static int multiply (String numberA, String numberB) {
    	if (intTest(numberA) && intTest(numberB) == true) {
            a = Integer.parseInt(numberA);  
            b = Integer.parseInt(numberB);
            return a * b;
        } else {
            return 0;
    	}		
    }
    
    //	This method is for Division
    public static int divide (String numberA, String numberB) {
    	if (intTest(numberA) && intTest(numberB) == true){
            a = Integer.parseInt(numberA);  
            b = Integer.parseInt(numberB);
            if (divideByZero(b)== true){
                return a / b;
            }
        }
        return 0;
    }
    // Stipulation to ensure NOT dividing by zero
    public static boolean divideByZero (int numberA) {
        try {
            if (numberA == 0)
                throw new ArithmeticException();
            else 
                return true;	
    	} catch (ArithmeticException e) {
            return false;
    	}
    }
	
    // This method is for Integers
    public static boolean intTest (String numberA) {
        try {
            Integer.parseInt(numberA);
    	} catch (NumberFormatException e) {
            return false;
    	}
    	return true;
    }
    
    // This method is for strings
    public static String string (String A) {
        return A;
    }
    
    // This method is for Arrays
    public static Integer[] array (Integer[] ray) {
        int one = ray[0];
        int two = ray[1];
        Integer [] newArray = {one, two};
        return newArray;
    }
}