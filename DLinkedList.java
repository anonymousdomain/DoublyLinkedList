package DoublyLinkedList;

public class DLinkedList {

  DLinkedListNode head, tail;
  int size;

  public DLinkedList() {
    size = 0;
    head = tail = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public int getSize() {
    return size;
  }

  public boolean sreach(String data) {
    DLinkedListNode node = head;
    if(head == null) {  
      return false;  
  } 
    while (node.next!= null && node.data != data){
      node=node.next;
    }
    if(node.data==data)
    return true;
    else return false;
      
    }
  
  
  

  public void addToHead(String data) {
    if (isEmpty()) {
      head = new DLinkedListNode(null, data, null); //prev & next are null
    } else {
      DLinkedListNode node = new DLinkedListNode(null, data, head);
      head.prev = node;
      head = node; //change head to a new created node
    }
    size++;
  }

  public void addToTail(String data) {
    if (isEmpty()) {
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

  public void insertAt(String data, int index) {
    if (isEmpty() || index > size) return;
    int i = 0;
    DLinkedListNode node = head;
    while (i < index) {
      node = node.next;
      i++;
    }
    if (node.prev == null) {
      DLinkedListNode newNode = new DLinkedListNode(null, data, node);
      node.prev = newNode;
      head = newNode;
    } else {
      DLinkedListNode newNode = new DLinkedListNode(node.prev, data, node);
      node.prev.next = newNode;
      node.prev = newNode;
    }
    size++;
  }

  public void removeFromHead() {
    if (isEmpty()) return; else {
      head = head.next; //shift the head to the next node
      head.prev = null; //detach it from the link
    }
    size--;
  }

  public void removeFromTail() {
    if (isEmpty()) return; else {
      DLinkedListNode node = head;
      while (node.next.next != null) {
        node = node.next;
      }
      node.next = null; //detach the last node
    }
    size--;
  }

  public void removeAt(int index) {
    if (isEmpty() || index > size) return;

    int i = 0; //list starts from zero
    DLinkedListNode node = head;
    while (i < index) {
      node = node.next;
      i++;
    }
    if (node.next == null) {
      node.prev.next = null;
    } else if (node.prev == null) {
      node = node.next;
      node.prev = null;
      head = node;
    } else {
      node.prev.next = node.next;
      node.next.prev = node.prev;
    }
    size--;
  }

  public void printList() {
    DLinkedListNode node = head; //node starting from head
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next; //itrate through the list
    }
    System.out.println();
  }
}
