/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acptest;

/**
 *
 * @author lil_ninja88
 */

// This Method implements MathOperation for Subtraction
public class ACPSubtract implements MathOperation{
    public Integer operate(Integer firstNum, Integer secondNum) {
        Integer Subtract = firstNum - secondNum;
        return(Subtract);
    }
}
