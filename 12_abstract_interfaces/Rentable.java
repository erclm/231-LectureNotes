/* 
    INTERFACES
    - allow us to define a list of method signatures
    that must be implemented 
    - standardize how different objects perform the same functions
    - unlike inheritance where a class can only have one direct parent, 
    classes can implement however many interfaces they like
*/
public interface Rentable {
    // provide all of the methods that a rentable object
    // should implement
    public boolean checkIn();
    public boolean checkOut();
}