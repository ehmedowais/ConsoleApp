package com.leetcode.graphs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraphOperationsTest {

    @Test
    void dfs() {
       List<Edge> edges = new ArrayList<>();
        HashMap<Integer, List<Edge>> graph = new HashMap<>();

            edges.add(new Edge(0,1));
            edges.add(new Edge(0,2));
            edges.add(new Edge(1,3));
            edges.add(new Edge(2,4));
            edges.add(new Edge(3,4));
            edges.add(new Edge(3,5));
            edges.add(new Edge(4,5));
            edges.add(new Edge(5,6));

        for(Edge edge: edges){
            var list = graph.get(edge.src);
            if(list == null) {
                list = new ArrayList<>();
                list.add(edge);
                graph.put(edge.src, list);
            }else {
                list.add(edge);
            }

        }
        GraphOperations.dfs(graph);
    }
}