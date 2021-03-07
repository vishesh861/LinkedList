public class Equilibrium {

    public void equi(int[] arr) {

        int i=0,j=arr.length-1,sum=0,sum1=0,flag=0;

        while (i<j) {
            sum += arr[i];
            sum1 += arr[j];

            if (sum == sum1) {
                System.out.println(i+1);
                flag = 1;
            }
            i++;
            j--;
        }

        if (flag == 0) {
            System.out.println("-1");
        }
    }
}
