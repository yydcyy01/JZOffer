package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 */
public class T25 {
    /*
    (二路归并) O(n)O(n)
    1 新建头部的保护结点dummy，设置cur指针指向dummy。
    2 若当前l1指针指向的结点的值val比l2指针指向的结点的值val小，则令cur的next指针指向l1，且l1后移；否则指向l2，且l2后移。
    3 然后cur指针按照上一部设置好的位置后移。
    4 循环以上步骤直到l1或l2为空。
    5 将剩余的l1或l2接到cur指针后边。
    6 时间复杂度
        两个链表各遍历一次，所以时间复杂度为O(n)

    */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
        public ListNode merge(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;

            ListNode dummy = new ListNode(-1);
            ListNode ret = dummy;
            while (l1 != null && l2 != null){
                if (l1.val <= l2.val){
                    dummy.next = l1;
                    l1 = l1.next;
                }else { // l1.val > l2.val
                    dummy.next = l2;
                    l2 = l2.next;
                }
                dummy = dummy.next;  //别忘维护dummy
            }
            dummy.next = (l1 == null? l2 : l1);
            return ret.next;
        }

}
