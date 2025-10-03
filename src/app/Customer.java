package app;

public class Customer {
    private final String name;
    private final String lastName;

    public Customer(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }
}
