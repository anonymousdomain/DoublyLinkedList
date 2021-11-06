/*
data structure & algorithms  first assignment 

DLinkedListTest source code

Name:Dawit Yitagesu
ID:DBUR/0311/10
*/
package DoublyLinkedList;

public class DLinkedListTest {

  public static void main(String[] args) {
    DLinkedList dlist = new DLinkedList();

    //check the list
    System.out.println(dlist.isEmpty());
    //add to head
    dlist.addToHead("Nahom");
    dlist.addToHead("devo");
    dlist.printList();

    // add to tail

    dlist.addToTail("eyuel");
    dlist.printList();

    // remove from head
    System.out.println(dlist.removeFromHead());

    System.out.println(dlist.removeFromTail());

    dlist.printList();
    dlist.addToTail("dawit");
    dlist.addToTail("miki");
    dlist.addToTail("neba");
    dlist.printList();
    dlist.insertAt("data", 2);
    System.out.println(dlist.getSize());
    System.out.println(dlist.search("neba"));
  dlist.printList();
  }
}
