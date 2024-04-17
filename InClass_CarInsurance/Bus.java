public class Bus extends Car {
    public int capacity;

    //default constructor with base class init
    public Bus(){
        super();
        this.capacity = 0;
    }

    //overloaded constructor with base class
    public Bus(int capacity, String make, String model, int year, String vin, int milesPerYear){
        super(make, model, year, vin, milesPerYear);
        this.capacity = capacity;
    }

    private Bus(){
        super
    }

    public int getCapacity(){
        return this.capacity;
    }

    @Override
    public int calculateMonthlyFee(){//goes here <--
        return super.calculateMonthlyFee() + this.capacity * 20;
    }
    public static void main(String[] args) {
        Bus a = new Bus(50, ABC, BCD, 2010, duhsdifauhafsdiuhisfudah, 20000);
        a.calculateMonthlyFee();//execution -->
        a.getVIN();//still works

        SchoolBus b = new SchoolBus();
        b.getVIN();
    }

}

