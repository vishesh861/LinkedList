public class Merge_Arr {

    public void merge(int[] arr1, int[] arr2) {

       int a = arr1.length;
       int b = arr2.length;

       for (int i=b-1; i>=0; i--) {

           int j,l = arr1[a-1];

           for (j=a-2; j>=0; j--) {
               arr1[j+1] = arr1[j];
           }

           if(j != a-2 || l > arr2[i]) {
               arr2[j+1] = arr2[i];
               arr2[i] = l;
           }
       }


    }
}
