package POO;

public class Customer {
    // Abstract my object characteristics in thi case customer properties
    int id;
    int age;
    String name;
    String lastname;

    double moneyAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    // Create the constructor, using the previous declared properties and using this. creating the parameters for the objects
    public Customer(int id, int age, String name, String lastname, double moneyAmount) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.lastname = lastname;
        this.moneyAmount = moneyAmount;



    }

    public void privileges (double moneyAmount) {
        if (moneyAmount <= 100000) {
            System.out.println("You have a basic plan");
        }
        if (moneyAmount <= 2000000) {
            System.out.println("You have a Priority plan");
        }
        if (moneyAmount > 3000000) {
            System.out.println("You have a VIP plan");
        }
    }

}
