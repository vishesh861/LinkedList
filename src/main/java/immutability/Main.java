package immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]) {

        Address address = new Address();
        address.setBlock(1);
        address.setStreet("Ram Nagar");

        Map<String, String> map = new HashMap<>();
        map.put("1", "first");

        ArrayList<String> list = new ArrayList<>();
        list.add("first");

        Employee demo = new Employee(11, "Vishesh", address, map, list);

        System.out.println(demo.getAddress().getStreet());
        //address.setStreet("Pushkar Road");
        demo.getAddress().setStreet("Pushkar Road");
        System.out.println(demo.getAddress().getStreet());
    }
}
