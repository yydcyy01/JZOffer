package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 * http://acwing.com/problem/content/submission/code_detail/48690/
 * 反转链表
 */
public class T24 {
     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
       }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return  prev;
    }
}
