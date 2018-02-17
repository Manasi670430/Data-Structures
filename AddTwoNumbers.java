/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.*/



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ans=new ListNode(0);
        ListNode curr=ans;
        while(l1!=null || l2!=null){
            int v1=l1!=null?l1.val:0;
            int v2=l2!=null?l2.val:0;
            int sum=(v1+v2+carry)%10;
            carry=(v1+v2+carry)/10;
            curr.next=new ListNode(sum);
            curr=curr.next;
            l1=l1!=null?l1.next:l1;
            l2=l2!=null?l2.next:l2;
            
        }
        if(carry!=0){
            curr.next=new ListNode(carry);
            curr=curr.next;
        }
        return ans.next;
    }
}


