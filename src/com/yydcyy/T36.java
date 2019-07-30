package com.yydcyy;

/**
 * Created by Administrator on 2019-04-02.
 */
public class T36 {/*
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1== null && l2 == null) return null;
        if (l1 == null || l2 == null)
            return l1 == null ? l2:l1;

      //  ListNode dummy.next = new ListNode(0);
       // ListNode cur = dummy;
        //Integer.Max
        while (l1 != null && l2 != null){  // 处理 l1, l2
            //比较 l1.val >= l2.val
            if (l1.val >= l2.val){
                cur.next = l2;
                l2 = l2.next;
            }
            else{//  // <
                cur.next = l1;
                l1 = l1.next;
            }
            cur = cur.next;
        }

        // l1 空了, l2接上
        cur.next =  (l1 == null ? l2:l1 );
    }*/
}
