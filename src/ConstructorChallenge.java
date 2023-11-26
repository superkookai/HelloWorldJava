public class ConstructorChallenge {
    public static void main(String[] args) {
        Customer c1 = new Customer("Billy",500.0,"billy@email.com");
        Customer c2 = new Customer();
        Customer c3 = new Customer("Sam","sam@email.com");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

class Customer{
    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("Default customer",100.0,"Default email");
    }

    public Customer(String name, String email){
        this(name,80.0, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
