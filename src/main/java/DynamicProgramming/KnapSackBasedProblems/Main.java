package DynamicProgramming.KnapSackBasedProblems;


import New15.MaximumSumInCircularArray;
import New15.MergeIntervals;
import Threads.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        int[] weight = {1,2,3};
        int[] val = {10,15,40};
        int w = 6;
        int n = 3;
        MaximumWeightInBag m = new MaximumWeightInBag();
        int a = m.max_weight(weight, val, w, n);
        System.out.println(a);

       /* CoinChange c = new CoinChange();
        int[] arr = {1,2,3};
        int m = 3;
        int n = 4;
        c.change(arr, m, n);*/

      /* SubsetSumProblem subsetSumProblem = new SubsetSumProblem();
       int[] arr = {2,5,7,8,10};
       int sum = 11;
       int n = 5;
       boolean a = subsetSumProblem.subsetSum(arr, sum, n);
        System.out.println(a);*/

    /*   EqualSumPartition e = new EqualSumPartition();
       int[] arr = {5,7,11,5};
       int n = 4;
       boolean b = e.equalSum(arr, n);
        System.out.println(b);*/

       /*CountOfSubsetSum c = new CountOfSubsetSum();
       int[] arr = {2,3,5,6,8,10};
       int n = 6;
       int sum = 10;
       int b = c.count(arr, n, sum);
        System.out.println(b);*/

    /*  MinimumSubsetSumDifference m = new MinimumSubsetSumDifference();
      int[] arr = {1,2,7};
      int n = 3;
      int a = m.min(arr, n);
        System.out.println(a);*/

   /* CountSubsetWithGivenDiff c = new CountSubsetWithGivenDiff();
    int[] arr = {1,1,2,3};
    int diff = 1;

    c.count(arr, diff);*/
        /*int arr[] = { 11, 10, -20, 5, -3, -5, 8, -13, 10 };
        MaximumSumInCircularArray.maxCircularSum(arr,9);*/


    }
}
