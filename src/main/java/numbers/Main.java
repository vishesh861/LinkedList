package numbers;

public class Main {

    public static void main(String[] args) {

        FindMedianFromDataStream f = new FindMedianFromDataStream();
        f.addNum(1);
        f.addNum(2);
        f.findMedian();
        f.addNum(3);
        f.findMedian();
    }

}
