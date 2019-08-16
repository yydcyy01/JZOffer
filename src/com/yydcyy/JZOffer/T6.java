package com.yydcyy.JZOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by YYDCYY on 2019-08-16.
 * https://www.acwing.com/problem/content/description/18/
 *
 * 大雪菜的acwing上这道题返回的是int[];大雪菜做饭普遍简单粗暴啊!
 * cyc题目返回ArrayList<> 所以可以 3 种不同做法 : cyc 聚集多方奇淫巧技

 若返回ArrayList<Integer> , 及给链表返链表的话,就是链表逆转.  3种做法
 1 : 链表 = 递归

 2: 栈 , 实现逆转

 3 : 使用头插法, 新建头结点 , 遍历给的List, 每次头插即可
头结点与第一个节点区别 :
    ※ 头结点是头插法中使用的第一个额外的节点, 此节点不存值
    ※ 第一个节点就是链表第一个真正存储值的节点
 */

public class T6 {
    /**
     *
     */
        /*
           看, 返回的是数组.
           栈存值, 最后pop到字符串,字符串转数组(我不知道int[]空间啊,不转你说咋办)
           模仿大雪菜的栈 做法
        */
        /*public int[] printListReversingly(ListNode head) {
            if (head == null) return null;

            //初始化
            StringBuilder sb = new StringBuilder();
            ListNode node = head;
            Stack<ListNode> stack = new Stack<>();

            //栈初始化
            while (node != null){
                stack.push(node);
                node = node.next;
            }

            while(!stack.isEmpty()){
                sb.append(stack.pop().val+" ");
            }

            String[] strArr = sb.toString().split(" ");
            //字符串转int
            int[] arr = new int[strArr.length];
            for (int i = 0; i < arr.length; i ++){
                arr[i] = Integer.parseInt(strArr[i]);
            }
            return arr;
        }*/

    /**
     若返回ArrayList<Integer> , 及给链表返链表的话,就是链表逆转.  3种做法
     1 : 链表 = 递归

     2: 栈 , 实现逆转

     3 : 使用头插法, 新建头结点 , 遍历给的List, 每次头插即可

     */
//1 递归实现
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode == null) return ret;


        if (listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    //2 栈实现
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode == null) return ret;
        Stack<Integer> stack = new Stack<>();

        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()){
            ret.add(stack.pop());
        }
        return ret;
    }
    //3 头插法实现
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
