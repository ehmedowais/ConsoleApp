package com.leetcode.arrays;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class StackOperations {
    /*This method is used to evaluate a notation like 2,1,+,3,* that will return a 9
    * */
    public static int evaluateReversePolishNotation(String[] str) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (String s : str) {

            switch (s) {
                case "+" -> {
                    result = 0;
                    while (!stack.isEmpty()) {
                        result += stack.pop();
                    }
                    stack.push(result);

                }
                case "-" -> {
                    result = 0;
                    while (!stack.isEmpty()) {
                        result = stack.pop() - result;
                    }
                    stack.push(abs(result));

                }
                case "*" -> {
                    result = 1;
                    while (!stack.isEmpty()) {
                        result *= stack.pop();
                    }
                    stack.push(result);

                }
                case "/" -> {
                    result = 1;
                    while (!stack.isEmpty()) {
                        result = stack.pop() / result;
                    }
                    stack.push(result);
                }
                default -> stack.push(Integer.parseInt(s));
            }

        }
        return result;
    }

    public static int[] findDaysToGetHigherTemp(int[] temps) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> indices = new Stack<>();
        int[] result = new int[temps.length];
        Arrays.fill(result, 0);
        stack.push(temps[0]);
        indices.push(0);
        for(int i=1; i< temps.length; i++) {
            if(temps[i] <= stack.peek()){
                stack.push(temps[i]);
                indices.push(i);
            }else {
                while(!stack.isEmpty()) {
                    stack.pop();
                    result[i - 1] += i - indices.pop();
                }
                stack.push(temps[i]);
                indices.push(i);
            }
        }
        return result;
    }
    public static int numberOfCarsReachingDestination(int target, int[] position, int[] speed) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Double> stack = new Stack<>();
        for(int i=0; i< position.length; i++) {
            map.put(position[i], speed[i]);
        }
        int[] sortedPositions = Arrays.stream(position)
                .boxed() // Convert int to Integer
                .sorted((a, b) -> b.compareTo(a)) // Sort in reverse order
                .mapToInt(Integer::intValue) // Convert back to int
                .toArray();
        for(int i=0; i< sortedPositions.length; i++) {
            var pos = (1.0 *(target - sortedPositions[i])) / (1.0* map.get(sortedPositions[i]));
            if(!stack.isEmpty()){
                if(stack.peek() < pos) {
                    stack.push(pos);
                }
            }else{
                stack.push(pos);
            }
        }
        return stack.size();
    }

    public static int maxAreaOfHistogram(int[] histogram){
        int curMax = 0;
        int n = histogram.length;
        int[] toRight = new int[n];
        int[] toLeft = new int[n];
        toRight[n-1] = n-1;
        toLeft[0] =0;
        int temp = n-1;
        for(int i=0; i<n; i++){
            for(int j = i+1; j< n; j++){
                if(histogram[j] < histogram[i]){
                    temp = j;
                    break;
                }

            }
            toRight[i] = temp;
            temp = n-1;
        }
        temp = 0;
        for(int i=n-1; i>=0; i--){
            for(int j = i-1; j>= 0; j--){
                if(histogram[j] < histogram[i]){
                    temp = j;
                    break;
                }

            }
            toLeft[i] = temp;
            temp = 0;
        }
        for(int i=0; i<n;i++){
            var factor = toRight[i] - toLeft[i] -1;
            curMax = max(curMax, histogram[i]*(Math.max(factor, 1)));
        }
        return curMax;
    }
}
