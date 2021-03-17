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

  public boolean sreach(String data) {
    DLinkedListNode node = head;
    if (this.head == null) {
      return false;
    }
    while (node.next != null && node.data != data) {
      node = node.next;
    }
    if (node.data.equals(data)) return true; else return false;
  }

  public void addToHead(String data) {
    if (isEmpty()) {
      this.head = new DLinkedListNode(null, data, null); //prev & next are null
    } else {
      DLinkedListNode node = new DLinkedListNode(null, data, this.head);
      this.head.prev = node;
      this.head = node; //change head to a new created node
    }
    size++;
    this.tail = this.head.next;
  }

  public void addToTail(String data) {
    DLinkedListNode newNode = new DLinkedListNode(null, data, null);
    if (isEmpty()) {
      this.head = this.tail = new DLinkedListNode(null, data, null);
    } else {
      this.tail.next = newNode;
      newNode.prev = this.tail;
      this.tail = newNode;
      this.tail.next = null;
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
      this.tail.prev.next = null;
      this.tail = this.tail.prev.prev;
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
