package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLastWithoutTail(99);
        list.insertLast(99);
        list.insertAtIndex(100, 3);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.deleteIndex(2));
        list.display();
    }
}
