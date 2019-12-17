/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acptest;

import java.util.HashMap;

/**
 *
 * @author lil_ninja88
 */
public class ACPController {
    
    // Create a HashMap to link the string to the doMath interface
    public static HashMap<String, MathOperation> hashMapOfOperation = new HashMap<String, MathOperation>();

    public  ACPController() {
}	
	
    public  Integer handleOperation(String operation, Integer firstNum, Integer secondNum) {
        
    // Connect the hashmap key to the class that needs to be implemented
    hashMapOfOperation.put("+", new ACPAdd());
    hashMapOfOperation.put("-", new ACPSubtract());
    hashMapOfOperation.put("*", new ACPMultiply());
    hashMapOfOperation.put("/", new ACPDivide());
			
    // Create an instance of the MathOperation class based on the operation passed
    MathOperation doMath = hashMapOfOperation.get(operation);
	
    // Execute the code to complete the simple math calculation and return the results to the main application
    return(doMath.operate(firstNum, secondNum));	

    }
}