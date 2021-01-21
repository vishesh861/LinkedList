import java.util.Arrays;
import java.util.Collections;

public class Abc {


    /*public static void concat1(String s1)
    {
        s1 = s1 + "forgeeks";
        System.out.println(s1);
    }*/
   /* public void check(int arr[]) {
        int[] prime = new int[arr.length];
        int[] composite = new int[arr.length];
        int temp = 0;

        for (int i=0; i<arr.length; i++) {
            int num = arr[i];
            for (int j=2; j<=num/2; j++) {
                if (num % j == 0) {
                    composite[i] = num;
                } else {
                    prime[i] = num;
                }
            }
        }

        for (int i = 0; i < prime.length; i++) {
            for (int j = i+1; j < prime.length; j++) {
                if(prime[i] > prime[j]) {
                    temp = prime[i];
                    prime[i] = prime[j];
                    prime[j] = temp;
                }
            }
        }

        for (int i = 0; i < composite.length; i++) {
            for (int j = i+1; j < composite.length; j++) {
                if(composite[i] > composite[j]) {
                    temp = composite[i];
                    composite[i] = composite[j];
                    composite[j] = temp;
                }
            }
        }

        for (int i=0; i<arr.length; i++) {
            int num = arr[i];
            for (int j=2; j<=num/2; j++) {
                if (num % j == 0) {

                }
            }
        }

    }*/

   public void sorting(int[] arr) {

       int prime = 0;
       int composite = 0;

       for (int i=0; i<arr.length; i++) {
           int flag = 0;
           for (int j=2; j<=arr[i]/2; j++) {
               if (arr[i] % j == 0) {
                   composite++;
                   flag = 1;
                   break;
               }
           }
           if (flag == 0) {
               prime++;
           }
       }

       int[] arr_prime = new int[prime];
       int[] arr_composite = new int[composite];

       prime = 0;
       composite = 0;

       for (int a : arr) {
           int flag = 0;
           for (int j=2; j<=a/2; j++) {
               if (a % j == 0) {
                   arr_composite[composite++] = a;
                   flag = 1;
                   break;
               }
           }
           if (flag == 0) {
               arr_prime[prime++] = a;
           }
       }

       Arrays.sort(arr_prime);
       //Arrays.sort(arr_composite, Collections.reverseOrder());

       int[] arrDesc = Arrays.stream(arr_composite).boxed()
               .sorted(Collections.reverseOrder())
               .mapToInt(Integer::intValue)
               .toArray();

       prime = 0;
       composite = 0;

       for (int i=0; i<arr.length; i++) {
           int flag = 0;
           for (int j=2; j<=arr[i]/2; j++) {
               if (arr[i] % j == 0) {
                   arr[i] = arrDesc[composite++];
                   flag = 1;
                   break;
               }
           }
           if (flag == 0) {
               arr[i] = arr_prime[prime++];
           }
       }

       for (int i=0; i<arr.length; i++) {
           System.out.println(arr[i]);
       }

   }

}