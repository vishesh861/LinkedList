public class PrimeNumer {

    public void prime(int a) {

    int count = 0;
     for (int i=2; i<Integer.MAX_VALUE; i++) {
         int flag = 0;
         for (int j=2; j<=i/2; j++) {

             if (i % j == 0) {
                 flag = 1;
                 break;
             }
         }
         if (flag == 0) {
             System.out.print(i + " ");
             count++;
         }
         if (count == a) {
             break;
         }
     }
    }
}
