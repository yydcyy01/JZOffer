package com.yydcyy.JZOffer;

/**
 * Created by YYDCYY on 2019-08-16.
 */
public class T18 {
    /*
    1 待删节点若不是尾节点, 直接下一个节点复制待删除节点即可 (前移)  ,  算是优化吧,不需要遍历
    2 不是
            2.1 list只有一个节点, 直接null即可
            2.2 遍历找到前驱节点, 执行删除操作
     */
    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null) return null;

        if (tobeDelete .next != null) {
            ListNode temp = tobeDelete.next;
            tobeDelete.val = temp.val;
            tobeDelete.next = temp.next;
        }
        else { // tobeDelete.next == null  情况
            if (head == tobeDelete){
                head = null;//2.1
            }
            else{ //2.2
                ListNode cur = head;
                while (cur.next != tobeDelete){
                    cur = cur.next;
                }
                ListNode temp = tobeDelete;
                cur.val = temp.val;
                cur.next = temp.next;
            }
        }

        return head;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
