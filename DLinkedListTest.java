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
        dlist.addToTail("beka");
        dlist.printList();
        System.out.println("size : "+dlist.getSize());
        //dlist.removeFromHead();
        System.out.println("###############");
       
        dlist.removeFromTail();
        System.out.println("size : "+dlist.getSize());
        dlist.removeAt(0);
        dlist.printList();

        System.out.println("size : "+dlist.getSize());
    }
}
