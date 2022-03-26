package ComparableAndComparator.ComparableEx;

import Threads.A;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("vishesh", 28));
        list.add(new Student("Amit", 30));

        Collections.sort(list);
        System.out.println(list);
    }
}
