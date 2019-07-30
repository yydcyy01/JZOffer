package com.yydcyy;

import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Administrator on 2019-04-05.
 */
public class T56 {
/*
* PriorityQueue 默认是 最小堆
* */
    @Test
    public void run1() {
    /*PriorityQueue queue = new PriorityQueue();
    queue.add(new Integer(544));
    queue.add(new Integer(1023));
    queue.add(new Integer(99999));
    queue.add(new Integer(34324));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());*/

        PriorityQueue queue2 = new PriorityQueue(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer) o1 - (Integer) o2 > 0 ? -1:1;
            }
        });
        queue2.add(new Integer(-9999));
        queue2.add(new Integer(-1234));
        queue2.add(new Integer(-234));
        queue2.add(new Integer(-4567));
        System.out.println( queue2.remove());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());

       /*int n = 30;
       for (int i = 0; i < n; i ++){
           System.out.println(i + " : : " + (i & 1));
       }*/
    }



}
