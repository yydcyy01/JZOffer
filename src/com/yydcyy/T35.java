package com.yydcyy;

import org.junit.Test;

/**
 * Created by Administrator on 2019-04-02.
 */
public class T35 {

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

    @Test
    public void run1(){
        ListNode head = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        ListNode temp2 = new ListNode(3);
        ListNode temp3 = new ListNode(4);
        ListNode temp4 = new ListNode(5);
        ListNode temp5 = new ListNode(6);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = null;

         ListNode revHead = reverseList(head);

        System.out.print("[");
         while (revHead != null){
             System.out.print( + revHead.val+" , " );
             revHead = revHead.next;
         }
        System.out.println("]");
    }

}
