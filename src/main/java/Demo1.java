

public class Demo1 {

   public int small (int[] arr, int[] arr1) {
       int min_cost = Integer.MAX_VALUE;
       for (int i=0; i<arr.length; i++) {
           int cost = 0;
           for (int j=0; j<arr.length; j++) {

               if (i==j) {
                   continue;
               }
               if (arr[i] < arr[j]) {
                   cost += ((arr[j] - arr[i])*arr1[j]);
               } else if (arr[i] > arr[j]) {
                   cost += ((arr[i] - arr[j])*arr1[j]);
               }


           }

           if (cost < min_cost) {
               min_cost = cost;
           }
       }

       return min_cost;

   }

}
