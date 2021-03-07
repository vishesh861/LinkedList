import arrays.CountSubarrayWithZeroSum;
import arrays.SumInArray;
import subsequence.LongestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /*int[] arr = {13,15,17,18,19,20,22};

        int n = 3 + arr.length;

        MissingNumber2 missingNumber = new MissingNumber2();
        missingNumber.missing_two(arr, n);*/

       /* LongestSubstring longestSubstring = new LongestSubstring();
       int max = longestSubstring.longestUniqueSubsttr("abcabcbb");
        System.out.println(max);*/

     /*   LongestPalindromeSubstring l = new LongestPalindromeSubstring();
        String str = l.longestPalindrome("babad");
        System.out.println(str);*/

       /* Node1 node1 = new Node1(1);
        node1.next = new Node1(2);
        node1.next.next = new Node1(3);
        node1.next.next.next = new Node1(4);
        node1.next.next.next.next = new Node1(5);
        node1.next.next.next.next.next = new Node1(6);
        node1.next.next.next.next.next.next = new Node1(7);
        node1.next.next.next.next.next.next.next = new Node1(8);

        RotateList1 rotateList = new RotateList1();
        Node1 head = rotateList.rotate(node1, 3);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }*/

        /*LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
        int[] arr = {5,8,3,7,9,1};
        int a = 6;
        l.longestSubsequence(a, arr);*/

/*    int[] arr = {1,2,3};
    int[] arr1 = {20,30,40};
    Demo1 d = new Demo1();
    int b = d.small(arr, arr1);
        System.out.println(b);*/
        String[] arr = {"vis", "poy"};
        String[] arr1 = {"vab", "pot"};
        Anagram_Demo a = new Anagram_Demo();
        int[] ar = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            String str = arr[i];
            String str1 = arr1[i];

            if (str.length() != str1.length()) {
                ar[i] = -1;
            } else {
                int b = a.anagram(str, str1);
                ar[i] = b;
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
