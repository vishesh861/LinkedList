public class Fibonacci {

    public void fibo(int n) {
        int a = 0,b = 1, sum = 0;
        System.out.print(a + " " + b + " ");
        int c = n-2;
        while (c-->0) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}
