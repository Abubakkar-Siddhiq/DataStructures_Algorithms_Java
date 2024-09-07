public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Insert
    public void insert(int val, int index) {
        if(index < 0 || index > size) return;

        if(index == 0) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        Node tmp = head;

        for(int i=1; i < index; i++) {
            tmp = tmp.next;
        }

        // Tmp's next is "node's" next
        // Tmp's next's prev is "node"
        // "node"`s prev is tmp
        tmp.next.prev = node;
        node.next = tmp.next;
        node.prev = tmp;
        tmp.next = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null) {
            head.prev = node;
        }

        head = node;
        size++;


        if(tail == null) {
            tail=head;
        }
    }

    public void insertLast(int val) {
        if(head == null) {
            insertFirst(val);
            return;
        }

        Node last = head;
        Node node = new Node(val);
        node.next = null;

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        tail = node;
        size++;
    }

    // Delete
    public void delete(int index) {
        if(index < 0 || index >= size) return;

        if(index == 0) {
            deleteFirst();
            return;
        }

        if(index == size - 1) {
            deleteLast();
            return;
        }

        Node tmp = head;
        for(int i=0; i < index - 1; i++) {
            tmp = tmp.next;
        }

        tmp.next = tmp.next.next;
        tmp.prev = tmp;
    }

    public void deleteFirst() {
        if(head == null) return;
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if(tail == null) return;
        tail.prev.next = null;
        size--;
    }

    // Other Methods
    public void display() {
        Node node = head;

        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node node = tail;
        System.out.print("END");

        while(node != null) {
            System.out.print(" -> " + node.val);
            node = node.prev;
        }
    }

    public void find() {

    }

//    public void get(int index) {
//        if(inde)
//    }
    public int size() {
        return size;
    }
}
