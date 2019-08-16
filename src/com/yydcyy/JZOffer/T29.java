package com.yydcyy.JZOffer;

import java.util.Stack;

/**
 * Created by YYDCYY on 2019-08-16.
 */
public class T29 {
        Stack<Integer> valStack;
        Stack<Integer> minStack;

        /** initialize your data structure here. */
        public T29() {
            valStack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            valStack.push(x);
            minStack.push(minStack.isEmpty() ? x: Math.min(minStack.peek(), x)); // 多次压入同一个值
        }

        public void pop() {
            valStack.pop();
            minStack.pop();
        }

        public int top() {
            return valStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }

}
