public class Skillenza {

    public void skillenza(int arr[]) {

        int i=0;
        int max = 0, max1 = 0;
        while (i != arr.length) {
            int count = 0;
            for (int j=i; j<arr.length; j++) {

               if (j == arr.length-1) {
                    max = Math.max(max, count+1);
                    break;
                } else if (arr[j] > arr[j+1]) {
                   max = Math.max(max, count+1);
                   break;
               } else {
                    count++;
                }
            }

            i++;
        }
        i=0;
        while (i != arr.length) {
            int count = 0;
            for (int j=i; j<arr.length; j++) {

                if (j == arr.length-1) {
                    max1 = Math.max(max1, count+1);
                    break;
                } else if (arr[j] < arr[j+1]) {
                    max1 = Math.max(max1, count+1);
                    break;
                }
                else {
                    count++;
                }
            }

            i++;
        }

        int k = Math.max(max, max1);
        System.out.println(k);

    }
}
