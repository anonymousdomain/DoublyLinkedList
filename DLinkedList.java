package DoublyLinkedList;

public class DLinkedList {

  DLinkedListNode head, tail;

  public DLinkedList() {
    head = tail = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void addToHead(String data) {
    if (head == null) {
      head = new DLinkedListNode(null, data, null); //prev & next are null
    } else {
      DLinkedListNode node = new DLinkedListNode(null, data, head);
      head.prev = node;
      head = node; //change head to a new created node
    }
  }

  public void addToTail(String data) {
    if (head == null) {
      head = new DLinkedListNode(null, data, null);
    } else {
      DLinkedListNode node = head; //starting from head
      while (node.next != null) {
        node = node.next;
      }
      tail = new DLinkedListNode(node, data, null);
      node.next = tail;
    }
  }
public void removeFromHead(){
    if(head==null)return;
    else{
        head=head.next;//shift the head to the next node
        head.prev=null;//detach it from the link
    }
}
public void removeFromTail(){
    if(head==null)return;
    else{
        DLinkedListNode node=head;
        while(node.next.next!=null){
            node=node.next;
            
        }
       node.next=null;//detach the last node
    }
}
  public void printList() {
    DLinkedListNode node = head; //node starting from head
    while (node != null) {
      System.out.println(node.data);
      node = node.next; //itrate through the list
    }
  }
}
