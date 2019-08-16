package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 */
public class T22 {
    public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
        public ListNode findKthToTail(ListNode pListHead, int k) {
            if (pListHead == null)
                return null;

            int n = 0;
            ListNode dymmy = pListHead;
            while (dymmy != null){
                n ++;
                dymmy = dymmy.next;
            }

            if (k > n) return null;

            int temp = n - k;
            dymmy = pListHead;
            while (temp -- != 0){
                dymmy = dymmy.next;
            }
            return dymmy;
        }
}
