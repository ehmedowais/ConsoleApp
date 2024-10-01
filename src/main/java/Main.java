// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import com.java.general.CleanableRoom;
import com.leetcode.arrays.TwoSum;

import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.leetcode.arrays.TwoSum.twoSumSquaredComplexity;
public class Main {
    public static void main(String[] args) throws Exception {
        var twoSum = TwoSum.twoSumLinearComplexity(new int[]{2,7,11,15}, 9);
        assert twoSum[0]==0 : "Assertion successful";
        assert twoSum[1]==1 : "Second assertion successful too .......";
        //targetSum(new int[]{5,3,1,2,3,1,3,1,2,3,2,2,2});
        var testData = List.of("1 2 50", "1 7 70","1 3 20","2 2 17");
        var response = processLogs(testData, 2);
        response.forEach(System.out::println);
        try(CleanableRoom room = new CleanableRoom(5)){

            room.createVectors();
            room.readVector();
            System.out.println("Good bye");
        }
    }

    public static void targetSum(int[] arr) {
        final var map = new LinkedHashMap<Integer, Integer>();
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(s -> s))
                .forEach((k, v) ->  map.put(k,v.size()));
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        var strs = new String[]{"CISCO","NETWORKS"};
        System.out.println(Arrays.stream(strs).collect(Collectors.joining(",")));
        System.out.println(Arrays.stream(arr).boxed().max(Comparator.naturalOrder()).get());
        var min = Arrays.stream(arr)
                    .boxed().min(Integer::compareTo);
        var max = Arrays.stream(arr)
                .boxed().max(Integer::compareTo);

        System.out.println(min.get() + " "+ max.get());

        Arrays.stream(arr).boxed().collect(Collectors.teeing(Collectors.minBy(Integer::compareTo), Collectors.maxBy(Integer::compareTo),
                (x,y) -> {System.out.println(x +" "+y);
                    return null;
                }));

        System.out.println(((Long) Arrays.stream(arr).boxed().count()).intValue());

    }

    public static List<String> processLogs(List<String> logs, int threshold) {
        List<Set<String>> listOfSets = new ArrayList<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> result = new HashSet<String>();
        for(String str: logs) {
            String[] arrStr = str.split("\\s");
            Set<String> set = new HashSet<String>();
            set.add(arrStr[0]);
            set.add(arrStr[1]);
            listOfSets.add(set);
        }
        for(Set<String> set: listOfSets){

            set.forEach(item -> {
                map.put(item,map.getOrDefault(item,0)+1);
                if(map.get(item) >= threshold) {
                    result.add(item);
                }
            });

        }
        return result.stream().sorted().collect(Collectors.toList());
    }

}



