package POO;

public class Customers {

    public static void main(String[] args) {

        Customer customer1 = new Customer(13213, 38, "Daniel", "Leon", 100000);

        // Now with the getters and setters we can have the customer specific data, for example this :
        System.out.println("Customer 1 tiene la cantidad de " + customer1.getMoneyAmount() + " En su cuenta");
        System.out.println("El nombre de customer 1 es " + customer1.getName());
        System.out.println("El apellido de customer 1 es " + customer1.getId());

        Customer customerMex1 = new CustomersMexico (1234, 40, "Luis", "Gonzales", 100000, 10000, "Merida, Yucatan", "Calle 60");
        Customer customerArg1 = new CustomersArgentina(5490, 19, "Julio", "Rojo", 90000, 5000, "Escobar, Buenos Aires", "Manzana 45");
    }
}
