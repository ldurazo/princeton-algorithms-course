package com.algorithms;

public class QuickUnion {
    private int id[];
    private int sz[];
    private int count;

    public QuickUnion(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    //time proportional to depth of i
    private int root(int i){
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    //time proportional to both depth of q and p
    public boolean find(int p, int q) {
        return root(p) == root(q);
    }

    public int count() {
        return count;
    }

    //time proportional to both depth of q and p
    public void unite(int p, int q) {
        int rootP = root(p);
        int rootQ = root(q);
        if (rootP == rootQ) return;

        // this is not working
        if   (sz[rootP] < sz[rootQ]) { id[rootP] = rootQ; sz[rootQ] += sz[rootP]; }
        else                         { id[rootQ] = rootP; sz[rootP] += sz[rootQ]; }
        count--;
    }

    @Override
    public String toString() {
        StringBuilder toStringArray = new StringBuilder();
        for (int i: id) {
            toStringArray.append(id[i]).append(" ");
        }
        toStringArray.append(" count ").append(count);
        return toStringArray.toString();
    }
}
