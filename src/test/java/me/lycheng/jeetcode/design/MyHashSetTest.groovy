package me.lycheng.jeetcode.design

class MyHashSetTest extends GroovyTestCase {

    void testMyHashSet() {
        MyHashSet set = new MyHashSet()

        assert !set.contains(1)
        set.add(1)
        assert set.contains(1)
        set.remove(1)
        assert !set.contains(1)
    }
}
