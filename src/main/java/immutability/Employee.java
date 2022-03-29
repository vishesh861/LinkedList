package immutability;

public final class Employee {

    private final int id;
    private final String name;
    private final Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        //this.address = address;
        Address clone = new Address();
        clone.setBlock(address.getBlock());
        clone.setStreet(address.getStreet());
        this.address = clone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
       // return address;
        Address clone = new Address();
        clone.setBlock(this.address.getBlock());
        clone.setStreet(this.address.getStreet());
        return clone;
    }

}
