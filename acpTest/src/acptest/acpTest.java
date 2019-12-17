/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acptest;
import java.util.Scanner;

/**
 *
 * @author lil_ninja88
 */

// 
public class acpTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ACPController acpControl = new ACPController();
            		
        Integer firstNum;
        Integer secondNum;
        String operation;
            
        Scanner in = new Scanner(System.in);
		
        System.out.println("Application Controller Pattern (ACP) using simple Math!");

        // Retrieve the first number from the user
        System.out.println("\nFIRST NUMBER: ");
        try{
            firstNum = Integer.parseInt(in.nextLine());
        } catch(NumberFormatException e){
            firstNum = 0;
        }

        // Retrieve the operation from the user
        System.out.println("\nOPERATION: \n\tAdd (+), Subtract(-), Multiply (*), or Divide (/)");            
        operation = in.nextLine();
            
        //Retrieve the second number from the user
        System.out.println("\nSECOND NUMBER: ");
        try {
            secondNum = Integer.parseInt(in.nextLine());
        } catch(NumberFormatException e){
            secondNum = 0;
        }
            
        // Validate input from the user
        if (operation.length() == 0) {
            System.out.println("\nERROR: INVALID OPERATOR: MUST BE +, -, *, or /");                
            return;
        } else if(firstNum < -1) {
            System.out.println("\nERROR: FIRST NUMBER MUST BE 0 OR GREATER THAN 0");
            return;
        } else if(secondNum <= 0) {
            System.out.println("\nERROR: SECOND NUMBER MUST BE GREATHER THAN 0");
            return;
        }

        char c = operation.charAt(0);
            
        // Make sure the operation entered by the user is valid
        if((c == '+') || (c == '-') || (c == '*') || (c == '/')){
            // Display the information entered by the user
            System.out.println("\nRESULT: " + firstNum + " " + operation + " " + secondNum + " = ");
            
            // Call application control code that determines specific "class . . . implements HandleOperation" code and display results
            System.out.println(acpControl.handleOperation(operation, firstNum, secondNum));
            
        } else {
            // Display an error message because the user did not enter valid input
            System.out.println("\nERROR: INVALID OPERATOR: MUST BE +, -, *, or /");
        }
    }
}
