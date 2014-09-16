package com.nearsoft;

import com.algorithms.QuickFind;

public class Main {

    public static void main(String[] args) {
	    QuickFind quickFind = new QuickFind(10);
        quickFind.unite(0,3);
        quickFind.unite(9,8);
        quickFind.unite(4,7);
        quickFind.unite(7,6);
        quickFind.unite(5,7);
        quickFind.unite(8,3);
        System.out.println(quickFind.toString());
    }
}
