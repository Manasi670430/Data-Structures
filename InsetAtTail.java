/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
 
    if(head==null){
        head.data=data;
        head.next=null;
        return head;
    }
    
    Node p=new Node();
    p=head;
    
    while(p.next!=null){
        p=p.next;
    }
    
    Node q=new Node();
    q.next=null;
    q.data=data;
    
    p.next=q;
    return head;
}
