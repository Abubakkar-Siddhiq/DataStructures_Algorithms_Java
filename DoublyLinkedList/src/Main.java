public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFirst(5);
        dll.insertFirst(6);
        dll.insertLast(9);
        dll.insertLast(10);
        dll.insertLast(23);
        dll.insert(0, 3);
        System.out.println("Display: ");
        dll.display();
        dll.delete(4);
        System.out.println("Delete: ");
        dll.display();
    }
}