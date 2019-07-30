package com.yydcyy;

import java.util.Stack;

/**
 * Created by Administrator on 2019-04-03.
 */
public class T41 {
    Stack<Integer> stackVal;
    Stack<Integer> stackMin;
    /** initialize your data structure here. */
    public void MinStack() {
        stackVal = new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int x) {
        stackVal.push(x);

        if (stackMin.empty() || stackMin.peek() >= x)
            stackMin.push(x);

    }

    public void pop() {
        Integer temp = new Integer(Integer.MAX_VALUE);
        if (!stackVal.empty())
            temp = stackVal.pop();

        if (stackMin.peek() == temp)
        stackMin.pop();

    }

    public int top() {
       // if (!stackVal.empty())
            return stackVal.peek();
    }

    public int getMin() {
       // if (!stackMin.empty())
            return stackMin.peek();

    }
}
