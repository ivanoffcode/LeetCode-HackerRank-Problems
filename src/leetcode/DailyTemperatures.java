package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DailyTemperatures {

    public static void main(String[] args) {
        int[] asd = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(DailyTemperatures(asd));
    }

    public static List<Integer> DailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        List<Integer> output = new ArrayList<>();
        for (int val : result) output.add(val);
        return output;
    }
}
