public class Demo {

    public void sort(int[] arr) {

        int i=0, j=arr.length-1;
//0,1,1,0,0,1,0,0,0,1
        while (i<j) {

            if (arr[i]==1 && arr[j]==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i]==0 && arr[j]==0) {
                i++;
            } else if (arr[i]==1 && arr[j]==1) {
                j--;
            } else {
                i++;
                j--;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}
