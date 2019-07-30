package com.yydcyy;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.util.*;

/**
 * Created by Administrator on 2019-04-05.
 */
public class T54 {
    PriorityQueue<Integer> min_heap = new PriorityQueue();  //最小堆,取出最小值
    PriorityQueue<Integer> max_heap = new PriorityQueue(new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return (Integer) o1 - (Integer) o2 > 0 ? -1:1;
        }
    });//最大堆,取出最大值''


    public void insert(Integer num) {
        max_heap.add(num);
        if (min_heap.size() != 0 && max_heap.element() > min_heap.element() ){
            Integer maxv = max_heap.remove();
            Integer minv = min_heap.remove();
            min_heap.add(maxv);
            max_heap.add(minv);
        }

        if (max_heap.size() > min_heap.size() + 1)
            min_heap.add(max_heap.remove());

    }

    public Double getMedian() {
        System.out.println("max_heap.size() "+max_heap.size() + ": :"+"min_heap.size())" +min_heap.size());
        if ( ((max_heap.size() + min_heap.size()) & 1) == 1)  return (1.0 * max_heap.element());
        System.out.println("max_heap.element(): "+max_heap.element());
        return ( max_heap.element() + min_heap.element() ) / 2.0;
    }

    @Test
    public void run1(){
        T54 t = new T54();
        //[-3, -1, 1, 0, -4]
        t.insert(-3);
        System.out.println("getMedian()" + t.getMedian()); t.insert(-1);
        System.out.println("getMedian()" + t.getMedian()); t.insert(1);
        System.out.println("getMedian()" + t.getMedian()); t.insert(0);
        System.out.println("getMedian()" + t.getMedian()); t.insert(-4);
        System.out.println("getMedian()" + t.getMedian());

    }

    @Test
    public void run2(){
        /*int[] num = {1,2,3,4};
        int[] num2 = num.clone();
        num[2] = -1;
        for (int i:num       ) {
            System.out.println(i);
        }*/
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list;

        for (int i = 0; i < 10; i ++){
            list =   new ArrayList<>();
            for (int j = 0; j < 5; j ++){
                list.add(j);
            }
            Iterator m = list.iterator();
            while (m.hasNext()){
                System.out.print((Integer) m.next() + " ,, ");
            }
            ans.add(list);
        }

        Iterator it = ans.iterator();
        while (it.hasNext()){
            List<Integer> l = (List<Integer>) it.next();
                Iterator i = l.iterator();
                    while (i.hasNext()){
                        System.out.print((Integer) i.next() + " , ");
                     }
            System.out.println();
        }
    }
    
    @Test
    public void run3(){
        int[] arr = {1,2,3,-1,5};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i ++) {
            list.add(arr[i]);
        }

        Collections.sort(list);
        Iterator it = list.iterator();
        while (it.hasNext()){
            Integer t = (Integer) it.next();
            System.out.print(t+",");
        }
    }
    
}
