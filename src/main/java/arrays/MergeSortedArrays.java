package arrays;

/*
* Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
   Output: [1,2,2,3,5,6]
*
*
* */

public class MergeSortedArrays {

    public void merge(int[] a, int[] b) {

        int ptr1 = a.length-1, ptr2 = b.length-a.length-1, ptr3 = b.length-1;

        while (ptr1 >= 0 && ptr2 >= 0) {

            if (a[ptr1] >= b[ptr2]) {
                b[ptr3--] = a[ptr1--];
            } else {
                b[ptr3--] = b[ptr2--];
            }
        }

        while (ptr1 >= 0) {
            b[ptr3--] = a[ptr1--];
        }

        while (ptr2 >= 0) {
            b[ptr3--] = b[ptr2--];
        }

        for (int n : b) {
            System.out.print(n);
        }

    }

}
