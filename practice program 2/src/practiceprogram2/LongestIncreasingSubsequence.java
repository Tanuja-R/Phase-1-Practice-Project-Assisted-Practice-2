package practiceprogram2;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] numbers = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int n = numbers.length;

        int[] lis = new int[n];
        Arrays.fill(lis, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        int maxLIS = Arrays.stream(lis).max().orElse(1);
        System.out.println("Length of Longest Increasing Subsequence: " + maxLIS);
    }
}