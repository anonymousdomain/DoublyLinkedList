/*
data structure & algorithms  first assignment 

DoublyLinkedList implimentation source code

Name:Dawit Yitagesu
ID:DBUR/0311/10
*/
package DoublyLinkedList;

public class DLinkedList {

  DLinkedListNode head, tail;

  int size;

  public DLinkedList() {
    this.size = 0;
    this.head = this.tail = null;
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public int getSize() {
    return this.size;
  }

  public void addToHead(String data) {
    this.head = new DLinkedListNode(null, data, this.head);
    if (this.tail == null) this.tail = this.head;

    this.size++;
  }

  public void addToTail(String data) {
    if (!isEmpty()) {
      this.tail = new DLinkedListNode(this.tail, data, null);
      this.tail.prev.next = this.tail;
    } else this.head = this.tail = new DLinkedListNode(this.tail, data, null);
    this.size++;
  }

  public void insertAt(String data, int index) {
    if (!isEmpty() && index < size) {
      DLinkedListNode node = this.head, newNode;

      for (int i = 0; i < index; node = node.next, i++);
      if (node.prev == null) {
        this.head = new DLinkedListNode(null, data, this.head);
        this.tail = this.head;
      } else {
        newNode = new DLinkedListNode(node.prev, data, node);
        node.prev.next = newNode;
        node.prev = newNode;
      }
    }
    this.size++;
  }

  public String removeFromHead() {
    String info = null;
    if (!isEmpty()) {
      info = this.head.data;
      if (this.head == this.tail) {
        this.head = this.tail = null;
      } else this.head = this.head.next;

      this.size--;
    }
    return info;
  }

  public String removeFromTail() {
    String info = null;
    if (!isEmpty()) {
      info = this.tail.data;
      if (this.head == this.tail) {
        this.head = this.tail = null;
      } else {
        this.tail = this.tail.prev;
        this.tail.next = null;
      }
      this.size--;
    }
    return info;
  }

  public void removeAt(int index) {
    DLinkedListNode node;
    if (!isEmpty() && index < getSize()) {
      node= this.head;
      for (int i = 0; i < index; node = node.next);
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
    }
    this.size--;
  }

  public boolean sreach(String data) {
    DLinkedListNode node;
    if (!isEmpty()) {
      node= this.head;
      if(this.head.data=data){
        return true;
      }
      else
      for (; node.next != null && node.data != data; node = node.next);
    
    }return node.next!=null;
  }
   

  public void printList() {
    DLinkedListNode node = head; //node starting from head
    while (node != null) {
      System.out.println(node.data + " ");
      node = node.next; //itrate through the list
    }
    System.out.println("#####################");
  }
}
