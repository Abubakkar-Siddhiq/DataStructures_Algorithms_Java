public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {}

    // Insert
    public void insert(int index, int val) {
        if(index < 0 || index > size) return;

        if(index == 0) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node tmp = head;
        for(int i=1; i < index; i++) {
            tmp = tmp.next;
        }

        Node node = new Node(val, tmp.next);
        tmp.next = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;

        if(tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val) {
        Node node = new Node(val);

        if(tail == null) {
            insertFirst(val);
            return;
        }

        tail.next = node;
        node.next = null;
        tail = node;
        size++;
    }

    // Delete
    public void delete(int index){
        if(index < 0 || index >= size) return;

        if(index == 0) {
            deleteFirst();
            return;
        }

        // index - 1
        Node node = get(index - 1);
        node.next = node.next.next;
        size--;
    }

    public void deleteFirst(){
        if(head == null) {
            tail = null;
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(size == 0) return;

        if(size == 1) {
            deleteFirst();
            return;
        }
        
        Node node = get(size - 2);
        node.next = null;
        size--;
    }

    // Other Methods
    private Node get(int index) {
        if(index < 0 || index >= size) return null;

        Node node = head;

        for(int i=0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void display() {
        Node node = head;

        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }

        System.out.println("END");
    }

    public int size() {
        return size;
    }

}
