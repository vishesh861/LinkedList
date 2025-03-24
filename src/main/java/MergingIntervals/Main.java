package MergingIntervals;

public class Main {

    public static void main(String[] args) {

        int[][] arr = {
                {3,49},{23,44},{21,56},{26,55},{23,52},{2,9},{1,48},{3,31}
        };

        MergeOverlappingIntervals m = new MergeOverlappingIntervals();
        m.merge(arr);
    }

}
