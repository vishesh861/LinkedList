package immutability;

public class Main {

    public static void main(String args[]) {

        Address address = new Address();
        address.setBlock(1);
        address.setStreet("Ram Nagar");

        Employee demo = new Employee(11, "Vishesh", address);

        System.out.println(demo.getAddress().getStreet());
        //address.setStreet("Pushkar Road");
        demo.getAddress().setStreet("Pushkar Road");
        System.out.println(demo.getAddress().getStreet());
    }
}
