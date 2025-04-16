public class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // remove first
    public int removeFirst(){
        if (head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }

    // Remove laST
    public int removeLast(){
        if (head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    //reverse a linkedlist
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    // print 
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.addLast(4);
        dll.addLast(7);
        dll.addLast(9);
        dll.print();
        // dll.removeLast();
        // dll.removeLast();
        dll.reverse();
        System.out.println(size);
        // System.out.println(dll.removeFirst());
        dll.print();
    }
}
  