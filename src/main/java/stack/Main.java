package stack;

public class Main {

    public static void main(String[] args) {
        NextLargerElement nextLargerElement = new NextLargerElement();
        for (long l : nextLargerElement.nextLargerElement(new long[]{1, 3, 2, 4}, 4)) {
            System.out.print(l + " ");
        }
    }

}
