package com.leetcode.graphs;

import java.util.*;

public class GraphOperations {

    public static void dfs(HashMap<Integer, List<Edge>> graph){
        List<Integer> visitedVertices = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addLast(graph.get(0).get(0).src);
        while(!queue.isEmpty()){
            int vertex = queue.removeFirst();
            if(!visitedVertices.contains(vertex) && graph.get(vertex) != null) {
                graph.get(vertex).forEach(edge -> queue.addLast(edge.dest) );
                visitedVertices.add(vertex);
                System.out.println(vertex +" -> ");
            }
        }
    }
}
