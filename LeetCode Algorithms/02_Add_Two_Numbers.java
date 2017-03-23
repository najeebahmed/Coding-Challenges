/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class 02_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int overflow = 0;
        int tempCurr;
        ListNode curr = null;
        ListNode node = null;
        ListNode head = null;

        while(l1 != null || l2 != null) {
            tempCurr = 0;

            if(l1 != null) {
                tempCurr += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                tempCurr += l2.val;
                l2 = l2.next;
            }

            tempCurr += overflow;
            overflow = tempCurr / 10;
            tempCurr = tempCurr % 10;

            node = new ListNode(tempCurr);

            if(head == null)
                head = node;
            else
                curr.next = node;
            curr = node;
        }

        if(overflow != 0) {
            node = new ListNode(overflow);
            curr.next = node;
        }

        return head;
    }
}
