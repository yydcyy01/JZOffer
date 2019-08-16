package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 */
public class T23 {
    class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
            val = x;
            next = null;
         }
     }
        public ListNode entryNodeOfLoop(ListNode head) {
            if (head == null) return null;
            ListNode f = head, s = head;
            while (f.next.next != null){
                s = s.next;
                f = f.next.next;

                if (s == f){ // 相遇, 有环
                    f = head;
                    while (f != s){
                        f = f.next;
                        s = s.next;
                    }
                    return f; // 返回当前节点, 即为入口
                }
            }
            return null;
        }

}
