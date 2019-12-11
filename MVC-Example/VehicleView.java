package mvc.example;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lil_ninja88
 */

/* 
 * This is the View class and it houses any code to communicate (whether sending
 * or receiving), either with user input, or any computing system. 
 * There are varying ideas of what the View should hold, but this is what the
 * book gives guidance on and I like the authors idea.
 */
public class VehicleView {
    public void printVehicleDetails(String Year, String Make, String Mode){
      System.out.println("Vehicle: ");
      System.out.println("Year: " + Year);
      System.out.println("Make: " + Make);
      System.out.println("Model: " + Mode);
   }
}