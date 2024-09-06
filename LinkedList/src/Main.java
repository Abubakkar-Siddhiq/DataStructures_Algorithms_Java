public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

/*      System.out.println("Insert First: ");
        ll.insertLast(5);
        ll.insertLast(4);
        ll.insertLast(3);
        ll.display();
 */
        System.out.println("Insert Last: ");
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(4);
        ll.insertLast(5);
        ll.display();
        ll.insert(2, 0);
        ll.display();
        System.out.println(ll.size());
    }
}