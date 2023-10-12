package POO;

public class CustomersMexico extends Customer{

    int payment;
    String location;
    String mexicoAddress;

    public CustomersMexico(int id, int age, String name, String lastname, double moneyAmount, int payment, String location, String mexicoAddress) {
        super(id, age, name, lastname, moneyAmount);
        this.payment = payment;
        this.location = location;
        this.mexicoAddress = mexicoAddress;
    }
}

