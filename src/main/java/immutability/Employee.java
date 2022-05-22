package immutability;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class Employee {

    private final int id;
    private final String name;
    private final ArrayList<String> list;
    private final Map<String, String> map;
    private final Address address;

    public Employee(int id, String name, Address address, Map<String, String> map, ArrayList<String> list) {
        this.id = id;
        this.name = name;

        ArrayList<String> tempList = new ArrayList<>();
        for (int i=0; i<list.size(); i++) {
            tempList.add(list.get(i));
        }
        this.list = tempList;

        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.map = tempMap;
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

    public ArrayList<String> getList() {
        return (ArrayList<String>) list.clone();
    }

    public Map<String, String> getMap() {

        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : this.map.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    public Address getAddress() {
       // return address;
        Address clone = new Address();
        clone.setBlock(this.address.getBlock());
        clone.setStreet(this.address.getStreet());
        return clone;
    }

}
