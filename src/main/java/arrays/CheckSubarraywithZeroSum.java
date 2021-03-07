package arrays;

import java.util.ArrayList;

public class CheckSubarraywithZeroSum {

    public void findsum(int arr[],int n)
    {
        //Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum=0,flag=0;
        for (int i=0;i<arr.length; i++) {
            sum = sum + arr[i];

            if(list.contains(sum) || arr[i] ==0 || sum == 0) {
                System.out.println("true");
                flag = 1;
                break;
            }

            list.add(sum);

        }

         if (flag == 0) {
             System.out.println("false");
         }

    }
}
