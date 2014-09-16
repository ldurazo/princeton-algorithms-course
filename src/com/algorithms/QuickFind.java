package com.algorithms;

public class QuickFind {
    private int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i]=i;
        }
    }

    //1 operation
    public boolean find(int p, int q) {
        return id[p]==id[q];
    }

    //N operations
    public void unite(int p, int q) {
        int pid=id[p];
        for (int i: id) {
            if(id[i]==pid) id[i]=id[q];
        }
    }

    @Override
    public String toString() {
        StringBuilder toStringArray = new StringBuilder();
        for (int i: id) {
            toStringArray.append(id[i]).append(" ");
        }
        return toStringArray.toString();
    }
}