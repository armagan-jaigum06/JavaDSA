public class Assignment {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static Node getInsersectiiNode(Node head1, Node head2){
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    
    public static void deleteNafterM(Node head, int M, int N){
        Node curNode = head;

        while (curNode != null) {
            for(int i=1; i<M && curNode != null; i++){
                curNode = curNode.next;
            }
            if (curNode == null) {
                return;
            }
            Node temp = curNode.next;
            for(int i=0; i<N && temp != null; i++){
                temp = temp.next;
            }

            curNode.next = temp;
            curNode = temp;
        }
        
    }

    public static Node swapNodes(Node head, int x, int y){
        // No need to swap if same keys
        if (x == y) return head;

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, return original head
        if (currX == null || currY == null)
            return head;

        // If x is not head
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        // If y is not head
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;

        return head;
    }

    // Question 4

    public static Node segregateEvenOdd(Node head){
        if (head == null) {
            return null;
        }

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node current = head;

        while (current != null) {
            if (current.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }
        if (evenHead == null) {
            return oddHead;
        }
        evenTail.next = oddHead;

        if (oddTail != null) {
            oddTail.next = null;
        }
        return evenHead;

    }

    public static void printList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {

        // Problem 1

    //    Node common = new Node(6);
    //    common.next = new Node(7);

    //    Node head1 = new Node(4);
    //    head1.next = new Node(5);
    //    head1.next.next = common;

    //    Node head2 = new Node(1);
    //    head2.next = new Node(2);
    //    head2.next.next = new Node(3);
    //    head2.next.next.next = common;

    //    Node Intersection = getInsersectiiNode(head1, head2);

    //    if (Intersection != null) {
    //     System.out.println("Intersection At node with the data :  "+ Intersection.data);
    //    } else {
    //     System.out.println("No Insersection Found");
    //    }

    // Problem 2

    // Node head = new Node(1);
    // Node curr = head;
    // for(int i=2; i<=8; i++){
    //     curr.next = new Node(i);
    //     curr = curr.next;
    // }
    // System.out.print("Original List : ");
    // printList(head);
    // deleteNafterM(head, 2, 2);
    // System.out.print("Modified List : ");
    // printList(head);

    // Problem 3

        // Node head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);

        // System.out.print("Original list: ");
        // printList(head);

        // head = swapNodes(head, 2, 4);

        // System.out.print("List after swapping 2 and 4: ");
        // printList(head);

        // Problem 4

        Node head = new Node(8);
        head.next = new Node(12);
        head.next.next = new Node(10);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(6);

        System.out.print("Original List : ");
        printList(head);

        segregateEvenOdd(head);

        System.out.print("rearranged List : ");
        printList(head);
    }
}
