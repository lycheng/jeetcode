package me.lycheng.jeetcode.algorithm.design;

public class MyHashSet {

    private static int MAX = 1000001;

    private boolean[] container;

    public MyHashSet() {
        container = new boolean[MAX];
    }

    public void add(int key) {
        container[key] = true;
    }

    public void remove(int key) {
        container[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return container[key];
    }
}
