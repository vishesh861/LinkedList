package numbers;

import arrays.MedianFromDataStream;

public class Main {

    public static void main(String[] args) {

        MedianFromDataStream f = new MedianFromDataStream();
        f.addNum(1);
        f.addNum(2);
        f.findMedian();
        f.addNum(3);
        f.findMedian();
    }

}
