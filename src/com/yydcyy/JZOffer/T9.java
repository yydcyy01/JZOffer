package com.yydcyy.JZOffer;

import java.util.Stack;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/36/
 */
public class T9 {

        Stack<Integer> in;
        Stack<Integer> out;
        /** Initialize your data structure here. */
        public T9() {
            in = new Stack<Integer>();
            out = new Stack<Integer>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            in.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop()throws Exception {
            if (out.isEmpty())
                while (!in.isEmpty())
                    out.push(in.pop());

            if (out.isEmpty())
                throw new Exception("Queue is Empty.");

            return out.pop();
        }

        /** Get the front element. */
        public int peek() throws Exception{
            if (out.isEmpty())
                while (!in.isEmpty())
                    out.push(in.pop());

            if (out.isEmpty())
                throw new Exception("Queue is Empty.");

            return out.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            if (out.isEmpty())
                while (!in.isEmpty())
                    out.push(in.pop());

            if (out.isEmpty())
                return true;

            return false;
        }

}
