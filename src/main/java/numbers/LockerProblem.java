package numbers;

import java.util.Arrays;

public class LockerProblem {
    public void lockerStates(int n) {

        if (n <= 0) return; // No students == no lockers, nothing to print here

        char[] lockers = new char[n];
        Arrays.fill(lockers, 'O'); // First student/pass
        print(lockers);

        for (int i = 2; i <= n; i++) {
            for (int locker = 1; locker <= n; locker++) {
                if (locker % i == 0) { // Toggle locker
                    if (lockers[locker - 1] == 'C')
                        lockers[locker - 1] = 'O';
                    else
                        lockers[locker - 1] = 'C';
                }
            }
            print(lockers); // Finished row of lockers with this student
        }
    }

    public void print(char[] array) {
        for (char c : array) System.out.print(c + " ");
        System.out.println();
    }
}
