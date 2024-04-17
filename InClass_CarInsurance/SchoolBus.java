public class SchoolBus extends Bus {
    private String schoolname;

    public SchoolBus(){
        super();
        this.schoolname = "";
    }

    public SchoolBus(String schoolname, int capacity, String make, String model, int year, String vin, int milesPerYear){
        super(capacity, make, model, year, vin, milesPerYear);
        this.schoolname = schoolname;
    }

    @Override
    public int calculateMonthlyFee(){
        return super.getCapacity() + 100;
        super.capacity + 100;
    }
    
}
