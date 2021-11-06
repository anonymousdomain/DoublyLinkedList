/*
data structure & algorithms  first assignment 

DLinkedListNode implimentation source code

Name:Dawit Yitagesu
ID:DBUR/0311/10
*/
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
