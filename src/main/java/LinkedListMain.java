import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListMain {

    // Function that sorts
    // all the prime numbers
    // from the array in descending
  /*  static void sortPrimes(int arr[], int n)
    {
        //SieveOfEratosthenes(100005);

        // this vector will contain
        // prime numbers to sort
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 0; i < n; i++)
        {
            int flag = 0;
            for (int j=2; j <= arr[i]/2; j++) {
                if ((arr[i] % j) == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                v.add(arr[i]);
            }
        }
        Comparator comparator = Collections.reverseOrder();
        Collections.sort(v, comparator);

        int k = 0;

        // update the array elements
        for (int i = 0; i < n; i++)
        {
            int flag = 0;
            for (int j=2; j < arr[i]/2; j++) {
                if ((arr[i] % j) == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0 && i<v.size()) {
                arr[i] = v.get(k++);
            }
        }
    }*/

    public static void main(String[] args) throws Exception {
        /*LinkedList linkedList = new LinkedList();
        linkedList.insertIntoEmptyList(5);
        linkedList.insertAtTop(4);
        linkedList.insertAtTop(2);
        linkedList.insertAtTop(3);
        linkedList.insertAtTop(6);
        linkedList.insertAtTop(7);*/
        /*linkedList.insertAtEnd(10);
        linkedList.insertAtPositionAfter(9,3);
        linkedList.insertAtPositionBefore(10,5);*/
        // linkedList.deleteFirstNode(10);
       /* linkedList.start = new Node();
        linkedList.reverseList(linkedList.start);*/
        //linkedList.deleteFirstNode();
        //linkedList.reverseList();
        //linkedList.deleteSpecificNode(6);
       /* linkedList.deleteFromEnd();
        System.out.println(linkedList.toString());*/
      /* String s1 = "vishesh";
        Abc.concat1(s1);*/
        //  System.out.println(str);
/*
        int arr[] = {2,5,4,8,6,9,5};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.search(arr, arr.length, 10);*/



        /* p.printNos(10);*/
       /* int[] arr = {3,4,1,2};
        Print.checkRotatedAndSorted(arr, 4);*/

     /*  Person p = new Person();
       p.str_converter("aaabcd@%$&");*/

  /*   Scanner s = new Scanner(System.in);
     String str1 = s.nextLine();
     String str2 = s.nextLine();
     char[] str1_char = str1.toCharArray();
     char[] str2_char = str2.toCharArray();

     Anagram a = new Anagram();
     System.out.println(a.isAnagram(str1_char, str2_char));*/

     //   Duplicate.repeatedCharacter("vishesh");
       /* Abc a = new Abc();
        a.check("www.google.com");*/
/*
        int arr[] = {4, 3, 2, 6, 100, 17};
        int n = arr.length;

        sortPrimes(arr, n);

        // print the results.
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }*/

        /*String str = "xyz abc mnp \"asdf dfaa asdf\" asd \"fdas asdsdafF\"";
        Break b = new Break();
        b.breaak_string(str);

        System.out.println("vishesh");
        System.out.println("agarwal");*/
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i=0; i<N; i++) {
                arr[i] = sc.nextInt();
            }
            Skillenza skillenza = new Skillenza();
            skillenza.skillenza(arr);
            T--;
        }




    }
}