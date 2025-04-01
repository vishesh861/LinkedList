package arrays;

public class GasStation {

    public int gasStation(int[] gas, int[] cost) {
        int total = 0, curr_tank = 0, start_index = 0;
        for (int i = 0; i < gas.length; i++) {
            total = total + gas[i] - cost[i];
            curr_tank = curr_tank + gas[i] - cost[i];
            if (curr_tank < 0) {
                start_index = i + 1;
                curr_tank = 0;
            }
        }
        return (total >= 0) ? start_index : -1;
    }

}
