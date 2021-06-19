package DynamicProgramming.MatrixChainMultiplication;

public class Main {

    public static void main(String[] args) {

     /*   MCMRecursive m = new MCMRecursive();
        int[] arr = {1,2,3,4,3};
        int a = m.mcm(arr, 1, arr.length-1);
        System.out.println(a);*/

        PallindromePartitionRecursion p = new PallindromePartitionRecursion();
        String s = "geek";
        int i = 0;
        int j = s.length()-1;
        int a = p.pallindromePartition(s, i, j);
        System.out.println(a);
    }
}
