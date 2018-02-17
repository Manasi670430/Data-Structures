/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node InsertNth(Node head, int data, int position) {
    Node p=new Node();
    if(position==0){
        p.data=data;
        p.next=head;
        return p;
    }
    p=head;
    while(--position>0){
        p=p.next;
    }
    Node q=new Node();
    q.data=data;
    q.next=p.next;
    p.next=q;
    return head;

}
