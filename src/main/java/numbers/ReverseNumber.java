package numbers;

public class ReverseNumber {

    public int reverse(int num) {

        int x = Math.abs(num);
        int result = 0;
        while (x != 0) {

            int n1 = x%10;

            if (result > (Integer.MAX_VALUE - n1) / 10) {
                return 0;
            }

            x = x / 10;

            result = (result * 10) + n1;
        }

        return (num < 0) ? (-result) : result;
    }
}
