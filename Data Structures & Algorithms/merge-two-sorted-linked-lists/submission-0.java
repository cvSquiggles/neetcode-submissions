/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode previous = null;
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode firstNode = null;

        while(current1 != null && current2 != null)
        {
            if(current1.val <= current2.val) {
                if(previous != null){
                    previous.next = current1;
                }
                previous = current1;
                current1 = current1.next;
            }
            else{
                if(previous != null){
                    previous.next = current2;
                }
                previous = current2;
                current2 = current2.next;
            }

            if(firstNode == null)
            {
                firstNode = previous;
            }
        }

        if(current1 == null)
        {
            while(current2 != null)
            {
               if(previous != null){
                   previous.next = current2;
               }
               previous = current2;
               current2 = current2.next;

                if(firstNode == null)
                {
                    firstNode = previous;
                }
            }
        }
        else {
            while(current1 != null)
            {
                if(previous != null){
                    previous.next = current1;
                }
                previous = current1;
                current1 = current1.next;

                if(firstNode == null)
                {
                    firstNode = previous;
                }
            }
        }

        return firstNode;
    }
}