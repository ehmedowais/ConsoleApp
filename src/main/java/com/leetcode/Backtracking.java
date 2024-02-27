package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    public static List<List<Integer>> findAllSubSequences(List<Integer> nums) {
        if(nums.isEmpty()) {
            return new ArrayList<>();
        }
        return subSequencesWithBackTrack(nums, new ArrayList<>(), new ArrayList<>(), 0);
    }
    public static List<List<Integer>> subSequencesWithBackTrack(List<Integer> nums, List<List<Integer>> result, List<Integer> subSequence, int index) {
        result.add(new ArrayList<>(subSequence));
        for(int i = index; i< nums.size(); i++) {
            subSequence.add(nums.get(i));
            subSequencesWithBackTrack(nums, result, subSequence, i+1);
            subSequence.remove(nums.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        findAllSubSequences(List.of(1,2,3)).forEach(System.out::println);
    }
}
