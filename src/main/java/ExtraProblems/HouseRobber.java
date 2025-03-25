package ExtraProblems;

public class HouseRobber {

    public int maxMoney(int[] arr) {

        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }

        int position1 = 0, position2 = 0;
        for (int num : arr) {
            int temp = position1;
            position1 = Math.max(position2 + num, position1);
            position2 = temp;
        }
        return position1;
    }

}
