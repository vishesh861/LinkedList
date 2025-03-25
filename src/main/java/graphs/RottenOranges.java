package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static boolean isValid(int row, int col, int rowSize, int colSize) {
        return row >= 0 && row < rowSize && col >= 0 && col < colSize;
    }

    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int orangesRotting(int[][] mat) {
        int[] rOffset = {-1, 0, 1, 0};
        int[] cOffset = {0, 1, 0, -1};
        int rowSize = mat.length;
        int colSize = mat[0].length;
        Queue<Pair> queue = new LinkedList<>();
        boolean isFresh = false;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (mat[i][j] == 1) {
                    isFresh = true;
                }
            }
        }

        if (!isFresh) {
            return 0;
        }

        int time = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (mat[i][j] == 2) {
                    queue.offer(new Pair(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair curr = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int rowVal = curr.row + rOffset[j];
                    int colVal = curr.col + cOffset[j];
                    if (isValid(rowVal, colVal, rowSize, colSize) && mat[rowVal][colVal] == 1) {
                        mat[rowVal][colVal] = 2;
                        queue.offer(new Pair(rowVal, colVal));
                    }
                }
            }
            if (!queue.isEmpty()) {
                time++;
            }
        }

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (mat[i][j] == 1) {
                    return -1;
                }
            }
        }

        return time;
    }

}
