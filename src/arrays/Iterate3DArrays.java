package arrays;

import java.util.Arrays;

public class Iterate3DArrays {
    public static void main(String[] args) {
        int nums [][][]  = new int[3][3][3];
        int nums2 [][][] = {{{1, 2, 3},{4, 5, 6}, {7, 8, 9}}, {{10, 11, 12},{14, 15, 16}, {17, 18, 19}},
                {{21, 22, 23},{24, 25, 26}, {27, 28, 29}}};
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                for (int k = 0; k < nums2.length; k++) {
                    System.out.print(nums2[i][j][k] + " ");
                }

            }

        }
        //System.out.println(Arrays.deepToString(nums));
    }
}
