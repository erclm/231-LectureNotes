/**
 * Car (base)
 * 
 * Bus
 * - capacity
 * Truck
 * - weight
 * Motorcyle
 * - type moped
 * IndustrialVehicle
 * - type 
 * Van
 * - capacity
 * - weight
 * Sedan
 * SUV
 * - weight capacity
 * Luxury
 * - type (sports generic)
 */
public class Car {
    //Make -> String
    //Model -> String
    //Year -> int
    //VIN -> string
    //Miles per year -> int

    private String make;
    private String model;
    private int year;
    private String vin;
    private int milesPerYear;
    
    //default constructor
    public Car(){
        this.make = "";
        this.model = "";
        this.year = 1900;
        this.vin = "";
        this.milesPerYear = 0;
    }
    //Overloaded constructor
    public Car(String make, String model, int year, String vin, int milesPerYear){
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.milesPerYear = milesPerYear;
    }

    //Accessors
    public String getVIN(){
        return this.vin;
    }
    //Modifiers

    public int calculateMonthlyFee(){
        return this.milesPerYear*10;
    }
    
    //toString
    //comparisons

    @Override
    public boolean equals(Car a){
        return this.vin.equals(a.getVIN());
    }
}