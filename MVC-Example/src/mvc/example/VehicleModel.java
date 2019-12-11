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
 * This is the Model class and it houses data. 
 * It may also hold a representation of the data. The code that hides how the 
 * data is accessed and stored is also in this class.
 * 
 * Also note: I had to make the "Model" variable "Mode". Silly variables anyhow!
 */


public class VehicleModel {
    private String Year;
    private String Make;
    private String Mode;

    public String getYear() {
        return Year;
    }
    public void setYear(String Year) {
        this.Year = Year;
    }
    public String getMake() {
        return Make;
    }
    public void setMake(String Make) {
        this.Make = Make;
    }
    public String getMode() {
        return Mode;
    }
    public void setMode(String Mode) {
        this.Mode = Mode;
    }   
}
