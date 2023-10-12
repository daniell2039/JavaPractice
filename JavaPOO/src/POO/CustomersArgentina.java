package POO;

public class CustomersArgentina extends Customer{

    int payment;
    String location;
    String argentinaAddress;

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArgentinaAddress() {
        return argentinaAddress;
    }

    public void setArgentinaAddress(String argentinaAddress) {
        this.argentinaAddress = argentinaAddress;
    }

    public CustomersArgentina(int id, int age, String name, String lastname, double moneyAmount, int payment, String location, String argentinaAddress) {
        super(id, age, name, lastname, moneyAmount);
        this.payment = payment;
        this.location = location;
        this.argentinaAddress = argentinaAddress;


    }
}
