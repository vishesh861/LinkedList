package CustomCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Design a stack-like data structure. You should be able to push elements to this data structure and pop elements with maximum frequency.
//If there is a tie for the most frequent element, then the most recently pushed element is removed and returned.
public class MaxFreqElementStack {

    Map<Integer, Integer> frequency;
    Map<Integer, Stack<Integer>> group;
    int maxFrequency;

    // Use constructor to initialize the FreqStack object
    public MaxFreqElementStack() {
        frequency = new HashMap< >();
        group = new HashMap < > ();
        maxFrequency = 0;
    }

    // Use push function to push the value into the FreqStack
    public void push(int value) {
        int freq = frequency.getOrDefault(value, 0) + 1;
        frequency.put(value, freq);

        if (freq > maxFrequency) {
            maxFrequency = freq;
        }

        group.computeIfAbsent(freq, z -> new Stack <>()).push(value);
    }

    // Use the pop function to pop the showName from the FreqStack
    public int pop() {
        int show = 0;
        if (maxFrequency > 0) {
            show = group.get(maxFrequency).pop();
            frequency.put(show, frequency.get(show) - 1);

            if (group.get(maxFrequency).size() == 0) {
                maxFrequency--;
            }
        } else {
            return -1;
        }
        return show;
    }

}
