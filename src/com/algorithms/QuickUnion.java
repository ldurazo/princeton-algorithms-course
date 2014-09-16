package com.algorithms;

public class QuickUnion {
    private int id[];

    public QuickUnion(int N) {
        id = new int[N];
        for(int i:id)
            id[i]=i;
    }

    //time proportional to depth of i
    private int root(int i) {
        while(i !=id[i])
            i=id[i];
        return i;
    }

    //time proportional to both depth of q and p
    public boolean find(int p, int q) {
        return root(p) == root(q);
    }

    //time proportional to both depth of q and p
    public void unite(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i]=j;
    }
}
