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

  public void printList() {
    DLinkedListNode node = head; //node starting from head
    while(node!=null){
        System.out.println(node.data);
        node=node.next;//itrate through the list
    }
  }
}