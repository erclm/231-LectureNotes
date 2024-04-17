import java.sql.Driver;

public class InsurancePolicy {
    //Cars covered under this policy -> ArrayList
    //Drivers covered under this policy -> ArrayList


    //Policy renewal date -> Java util date 
    //Paid or not -> bool
    //renewal frequency - Annual(1), monthly(2), quarterly(3) -> int
    //PaymentMethod -> string (cc, bank, check)

    //Coverage Options
    //deductable
    //glass coverage
    //totaled reimbursement
    //breaks in 


    public InsurancePolicy(String policyNumber, Driver driver, String vehicleMake, String vehicleModel, int vehicleYear, double premium) {
        this.policyNumber = policyNumber;
        this.customerName = customerName;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        this.premium = premium;
    }
    //METHODS
    //List of drivers covered
    //Renewal date 
    //premium (cost) <-
    //due (cost) <-
    //List of cars under policy
    //Add or remove vehicles <- 
    //Add or remove drivers <-
    //Change Payment method
    //print summary (toString)
    //Compare (.equals)

}
