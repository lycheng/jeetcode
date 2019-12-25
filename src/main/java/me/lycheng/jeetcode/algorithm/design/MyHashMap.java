package me.lycheng.jeetcode.algorithm.design;

import java.util.Arrays;

public class MyHashMap {

    private int[] container;

    /** Initialize your data structure here. */
    public MyHashMap() {
        int MAX = 1000001;
        container = new int[MAX];
        Arrays.fill(container, -1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        container[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return container[key];
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        container[key] = -1;
    }
}
