package me.lycheng.jeetcode.design

class MyHashMapTest extends GroovyTestCase {

    void testMyHashMap() {

        MyHashMap map = new MyHashMap();
        map.put(1, 1)

        assert map.get(1) == 1
        map.remove(1)

        assert map.get(1) == -1
    }
}
