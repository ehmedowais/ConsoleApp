package com.leetcode.graphs;

public class Edge {
    public int src;
    public int dest;
    public int wt;

    public Edge(int src, int dest){
        this.src = src;
        this.dest = dest;
    }
    public Edge(int src, int dest, int wt){
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
}
