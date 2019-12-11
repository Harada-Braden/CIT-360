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
 * This is the Control class and it holds the information about how data is
 * manipulated and what the data does.
 * This is where the calculations are made or strings are assembled or almost
 * anything else that needs to happen with the data.
 */
public class VehicleControl {
   private VehicleModel model;
   private VehicleView view;
   
   public VehicleControl(VehicleModel model, VehicleView view){
      this.model = model;
      this.view = view;
   }
   
   public void setYear(String year){
      model.setYear(year);		
   }
   public String getYear(){
      return model.getYear();		
   }
   public void setMake(String make){
      model.setMake(make);		
   }
   public String getMake(){
      return model.getMake();
   }
   public void setModel(String mode){
      model.setMode(mode);		
   }
   public String getMode(){
      return model.getMode();
   }
   public void updateView(){				
      view.printVehicleDetails(model.getYear(), model.getMake(), model.getMode());
   }
   
}
