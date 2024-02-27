package com.leetcode.arrays;

import com.leetcode.Utils;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.function.Function;
public class IntArrays {

    public static List<List<Integer>> getPermutations(int[] nums) {
        var result = new ArrayList<List<Integer>>();

        _getPermutations(nums, result, 0);
        return result;
    }
    public static void _getPermutations(int[] nums, List<List<Integer>>permutations, int index) {
        if(nums.length -1 == index) {
            permutations.add(new ArrayList<>(Arrays.stream(nums).boxed().toList()));
        }
        for(int i = index; i<nums.length; i++){
            Utils.swap(i,index, nums);
            _getPermutations(nums, permutations, index+1);
            Utils.swap(i, index, nums);
        }
    }
    public static void printSubSequences(int[] array) {
        var subSeqCount = (int)Math.pow(2, array.length);
        for(int i=0;i<subSeqCount; i++){
            System.out.println();
            for(int j=0;j< array.length;j++) {
                if(BigInteger.valueOf(i).testBit(j)){
                    System.out.print(array[j]);
                }
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> getSubSequencesOfLengthN(int[] array, int len) {
        var subSeqCount = (int)Math.pow(2, array.length);
        var subSeq = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<subSeqCount; i++){
            //System.out.println();
            var tempArray =new ArrayList<Integer>();

            for(int j=0;j< array.length;j++) {
                if(BigInteger.valueOf(i).testBit(j)){
                    tempArray.add(j);

                }

            }
            if(tempArray.size() == len) {
                subSeq.add(tempArray);
            }
        }
        return subSeq;
    }
    public static int minCostOfSelectingNItems(int[] items, int[] cost, int n) {
        var minCost = new AtomicInteger(Integer.MAX_VALUE);
        var subSeqs = getSubSequencesOfLengthN(items, 3);
        subSeqs.forEach(seq -> {
            for(int i=0; i<3; i++ ) {
                if(items[seq.get(0)] < items[seq.get(1)] && items[seq.get(1)] < items[seq.get(2)]) {
                    minCost.set( Math.min(minCost.get(), cost[seq.get(0)]+ cost[seq.get(1)] + cost[seq.get(2)]));
                }
            }
        });

        return minCost.get();
    }

    public static int getMinimumFruits(List<Integer> fruits) {
        Map<Integer, Long> fruitCount;
        fruitCount = fruits.stream()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        fruitCount = Utils.sortByValue(fruitCount);
        fruitCount.forEach((k,v) -> System.out.printf("Key is %d: and value is %d:\n", k,v));
        var uniqueFruits = new HashSet<>(fruits);
        while(uniqueFruits.size() > 1) {
            var fruit1 = uniqueFruits.stream().findFirst().get();
            uniqueFruits.remove(fruit1);
            var fruit2 = uniqueFruits.stream().findFirst(). get();
            uniqueFruits.add(fruit1);
            while(fruit1 != null && fruit2!= null && fruitCount.get(fruit1).intValue() >= 1 && fruitCount.get(fruit2).intValue() >=1) {
               fruitCount.put(fruit1, fruitCount.get(fruit1)-1);
               fruitCount.put(fruit2, fruitCount.get(fruit2)-1);
            }
            if(fruitCount.get(fruit1).intValue() <= 0) {
                fruitCount.remove(fruit1);
                uniqueFruits.remove(fruit1);
            }
            if(fruitCount.get(fruit2).intValue() <= 0) {
                fruitCount.remove(fruit2);
                uniqueFruits.remove(fruit2);
            }
        }
        if(fruitCount.size() > 0)
            return fruitCount.values().toArray(new Long[]{})[0].intValue();
        return 0;

    }
    public static long getMinimumFruits(List<Integer> fruitsList, int size) {
        ArrayList<Integer> fruits = new ArrayList<>(fruitsList.stream().sorted().toList());
        for(int i=0, j=size-1; i< size && j >=0; i++,j--) {
            if(fruits.get(i) > 0 && fruits.get(j) > 0 && fruits.get(i) != fruits.get(j)) {
                fruits.set(i,-1);
                fruits.set(j,-1);

            }

        }
        return fruits.stream().filter(ith -> ith > 0).toList().size();
    }

    public static int recursion(int[] nums, int index, int sum) {

        if(index>= nums.length) {
            return sum;
        }

        sum = sum + nums[index];
        return recursion(nums, index+1, sum);
    }
    public static int arraySumRecursive(int[] integers, int size) {
        if (size == 0) return 0;
        int lastNumber = integers[size - 1];
        //System.out.println("Last Number is :"+lastNumber);
        int allButLastSum = arraySumRecursive(integers, size - 1);
        System.out.printf("LastNumber %d and allButLastSum is %d :\n", lastNumber,allButLastSum);

        return lastNumber + allButLastSum;
    }
    public static boolean binarySearch(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums[nums.length/2] == target){
            return true;
        }
        if(target > nums[(nums.length)/2]) {
            return _binarySearch(nums, target, nums.length/2, nums.length -1);
        }else {
            return _binarySearch(nums, target, 0, 1 + nums.length/2);
        }
    }

    public static boolean _binarySearch(int[] nums, int target, int left, int right) {
        if(right < left) {
            return false;
        }
        if(nums[(right - left)/2] == target){
            return true;
        }

        if(target > nums[(right - left)/2]) {
            return _binarySearch(nums, target, (right - left)/2, nums.length -1);
        }else {
            return _binarySearch(nums, target, 0, (right - left)/2);
        }
    }
    public static List<List<Integer>> generateCombinations(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.size(); i++) {
            var row = new ArrayList<Integer>();
            for (int j =0; j<=i; j++) {
                for(int k=0; k <=j; k++)
                    row.add(nums.get(k));
            }
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {

        //System.out.println(getMinimumFruits(List.of(3,3,3,3,3,2,2,1),8));
        //System.out.println(getMinimumFruits(List.of(3,3,3,3,3,2,2,1)));
       // System.out.println(arraySumRecursive(new int[]{1,2,3},3));
        System.out.println(binarySearch(new int[]{9,1,3,7,5,11}, 5));
    }
}
