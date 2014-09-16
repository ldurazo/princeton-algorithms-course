package com.nearsoft;

import com.algorithms.QuickFind;
import com.algorithms.QuickUnion;

public class Main {

    public static void main(String[] args) {
	    QuickUnion quickUnion = new QuickUnion(10);
        quickUnion.unite(8, 7);
        quickUnion.unite(5, 6);
        quickUnion.unite(6, 0);
        quickUnion.unite(0, 8);
        quickUnion.unite(2, 1);
        quickUnion.unite(3, 4);
        quickUnion.unite(3, 1);
        quickUnion.unite(4, 7);
        quickUnion.unite(4, 9);
        System.out.println(quickUnion.toString());

        QuickFind quickFind = new QuickFind(10);
        quickFind.unite(0, 7);
        quickFind.unite(6,8);
        quickFind.unite(1,2);
        quickFind.unite(5,6);
        quickFind.unite(4,2);
        quickFind.unite(9,1);
        System.out.println(quickFind.toString());
    }
}
