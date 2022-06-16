package arrays;

/*
* Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
   Output: [1,2,2,3,5,6]
*
*
* */

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = n + m - 1;
        int x = m - 1;
        int y = n - 1;

        while (p >= 0) {
            if (x >= 0 && y >= 0)
                nums1[p--] = nums1[x] > nums2[y] ? nums1[x--] : nums2[y--];
            else if (x < 0)
                nums1[p--] = nums2[y--];
            else
                nums1[p--] = nums1[x--];
        }
    }

}
