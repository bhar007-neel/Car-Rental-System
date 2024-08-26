public class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId){
        this.name = name;
        this.customerId =customerId;
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getName(){
        return name;
    }
}
