package com.github.hcsp.datastructure;

import java.util.Deque;
import java.util.LinkedList;

public class Stack {
    private Deque<Integer> stack = new LinkedList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        stack.push(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return stack.pop();
    }
}
