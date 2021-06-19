package flipkart;

//Input 1:
//    A =  [1, 2]
//    B =  [2, 1]
//Output 1:  1
//    Explanation 1:
//        If you start from index 0, you can fill in A[0] = 1 amount of gas. Now your tank has 1 unit of gas. But you need B[0] = 2 gas to travel to station 1.
//        If you start from index 1, you can fill in A[1] = 2 amount of gas. Now your tank has 2 units of gas. You need B[1] = 1 gas to get to station 0.
//        So, you travel to station 0 and still have 1 unit of gas left over. You fill in A[0] = 1 unit of additional gas, making your current gas = 2.
//        It costs you B[0] = 2 to get to station 1, which you do and complete the circuit.
public class Gas {

    public int canCompleteCircuit(final int[] gas, final int[] dist) {
        int si = 0;
        int ei = 0;
        int tank = 0;

        while(si < gas.length) {
            if(tank + gas[ei] >= dist[ei]) {
                tank = tank + gas[ei] - dist[ei];
                ei = (ei + 1) % gas.length;
                if(ei == si) {
                    return si;
                }
            } else {
                if(ei < si) {
                    return -1;
                } else {
                    ei = ei + 1;
                    si = ei;
                    tank = 0;
                }
            }
        }

        return -1;
    }
}
