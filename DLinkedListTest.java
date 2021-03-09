package DoublyLinkedList;

public class DLinkedListTest {

  public static void main(String[] args) {
    DLinkedList dlist = new DLinkedList();
    //add to head
    dlist.addToHead("Nahom");
    dlist.addToHead("Devo");
    dlist.printList();
    //add to tail
    System.out.println("###############");
    dlist.addToTail("Neba");
    dlist.addToTail("beka");
    dlist.printList();
    System.out.println("size : " + dlist.getSize());
    //add at any index
    dlist.insertAt("bura",3);
    dlist.insertAt("nati",2);
    dlist.printList();
    System.out.println("size : " + dlist.getSize());
    System.out.println("###############");
    dlist.removeFromTail();
    System.out.println("size : " + dlist.getSize());
    //remove from any index
    dlist.removeAt(2);
    dlist.removeAt(3);
    dlist.printList();
     System.out.println(dlist.sreach("Devo"));
     //dlist.sreach("neba");
    System.out.println("size : " + dlist.getSize());
  }
}
