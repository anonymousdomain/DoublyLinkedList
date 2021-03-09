package DoublyLinkedList;

public class DLinkedList {

  DLinkedListNode head, tail;
  int size;

  public DLinkedList() {
    size=0;
    head = tail = null;
  }

  public boolean isEmpty() {
    return head == null;
  }
  public int getSize(){
    return size;
  }
  public void addToHead(String data) {
    if (head == null) {
      head = new DLinkedListNode(null, data, null); //prev & next are null
    } else {
      DLinkedListNode node = new DLinkedListNode(null, data, head);
      head.prev = node;
      head = node; //change head to a new created node
    }
    size++;
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
    size++;
  }
public void removeFromHead(){
    if(head==null)return;
    else{
        head=head.next;//shift the head to the next node
        head.prev=null;//detach it from the link
    }
    size--;
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
    size--;
}
public void removeAt(int index){
  if(head==tail || index>size)return;
 
  int i=0;//list starts from zero
  DLinkedListNode node=head;
  while(i<index){
    node=node.next;
    i++;

  }
if(node.next==null){
  node.prev.next=null;
}else if(node.prev==null)
{
  node=node.next;
  node.prev=null;
  head=node;

}else{
  node.prev.next=node.next;
  node.next.prev=node.prev;
}
size--;
}
  public void printList() {
    DLinkedListNode node = head; //node starting from head
    while (node != null) {
      System.out.println(node.data);
      node = node.next; //itrate through the list
    }
  }
 
}
