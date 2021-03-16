package DoublyLinkedList;

//classpackage DoublyLinkedList;

public class DLinkedListNode {

  DLinkedListNode prev;
  String data;
  DLinkedListNode next;

  public DLinkedListNode(String data) {
    this(null, data, null);
  }

  public DLinkedListNode(
    DLinkedListNode prev,
    String data,
    DLinkedListNode next
  ) {
    this.prev = prev;
    this.data = data;
    this.next = next;
  }
}
