/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.example;

/**
 *
 * @author lil_ninja88
 */

public class MVCExample {

    public static void main(String[] args) {
      
        VehicleModel model  = retrieveVehicleFromDatabase();

        VehicleView view = new VehicleView();
        VehicleControl controller = new VehicleControl(model, view);
        controller.updateView();
    }

   private static VehicleModel retrieveVehicleFromDatabase(){
        VehicleModel vehicle = new VehicleModel();
        vehicle.setYear("2018");
        vehicle.setMake("Subaru");
        vehicle.setMode("Baja");
        return vehicle;
    }    
}
