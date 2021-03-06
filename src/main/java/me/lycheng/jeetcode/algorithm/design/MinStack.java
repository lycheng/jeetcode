package me.lycheng.jeetcode.algorithm.design;

class Node {
    int val;
    int minSoFar;
    Node next;

    public Node(int x) { val = x; minSoFar = x; }
}

public class MinStack {

    private Node head;

    public MinStack() {}

    public void push(int x) {
        Node node = new Node(x);
        node.next = head;
        if (head != null) {
            node.minSoFar = Math.min(node.val, head.minSoFar);
        }
        head = node;
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        if (head != null) {
            return head.val;
        }
        return 0;
    }

    public int getMin() {
        if (head != null) {
            return head.minSoFar;
        }
        return 0;
    }
}
