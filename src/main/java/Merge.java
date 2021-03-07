public class Merge {

    public void merge(int[] arr, int[] arr1) {
        int len = arr.length + arr1.length;
        int[] arrMerge = new int[len];

        int i=0,j=0,k=0;
        while (i<arr.length && j<arr1.length) {

            if (arr[i] < arr1[j]) {
                arrMerge[k++] = arr[i++];
            } else {
                arrMerge[k++] = arr1[j++];
            }
        }

        while (i<arr.length) {
            arrMerge[k++] = arr[i++];
        }

        while (j<arr1.length) {
            arrMerge[k++] = arr[j++];
        }

        for (int l=0;l<arrMerge.length;l++) {
            System.out.print(arrMerge[l] + " ");
        }

    }
}
