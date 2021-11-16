package com.gmail.chiyc88.learning.matrix;

import java.util.Arrays;

public class SparseParse {
    public static void main(String[] args) {
        int[][] compacted = new int[][]{
                {4, 4, 5}, {0, 0, 15}, {0, 3, 22}, {1, 1, 11}, {1, 2, 3}, {2, 3, -6}
        };
        System.out.println(Arrays.deepToString(compactedMatrixToOriginal(compacted)));
    }

    public static int[][] compactedMatrixToOriginal(int[][] compacted) {
        int[][] original = new int[compacted[0][0]][compacted[0][1]];
        for (int i = 1; i <= compacted.length - 1; i++) {
            original[compacted[i][0]][compacted[i][1]] = compacted[i][2];
        }
        return original;
    }
}
//此程式為 409570030紀昀辰/409570212洪畤鎧 共同撰寫