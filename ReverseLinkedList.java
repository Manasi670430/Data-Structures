/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
         if(head==null || head.next==null){
            return head;
        }else{
            ListNode p=null,n=head,c=null;
            while(n!=null){
                c=n;
                n=n.next;
                c.next=p;
                p=c;
                
            }
            return p;
        }
        
        
    }
}
