package DoublyLinkedList;

public class DLinkedListTest {
    public static void main(String[] args) {
        DLinkedList dlist=new DLinkedList();
        //add to head
        dlist.addToHead("Nahom");
        dlist.addToHead("Devo");
        dlist.printList();
        //add to tail
        System.out.println("###############");
        dlist.addToTail("Neba");
        dlist.printList();
    }
}
