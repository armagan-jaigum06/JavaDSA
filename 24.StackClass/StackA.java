import java.util.ArrayList;

public class StackA {

    // By the Help of Lnked List -> Method 2
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    static Node head;
    static Node tail;
    static int size;

    static class InnerStackB {
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        //pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        
    }

    
    // By the help of Arraylist -> Method 1
    static class InnerStackA {

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        InnerStackA.push(1);
        InnerStackA.push(2);
        InnerStackA.push(3);

        while (!InnerStackA.isEmpty()) {
            System.out.println(InnerStackA.peek());
            InnerStackA.pop();
        }

        InnerStackB.push(1);
        InnerStackB.push(2);
        InnerStackB.push(3);

        while (!InnerStackB.isEmpty()) {
            System.out.println(InnerStackB.peek());
            InnerStackB.pop();
        }
        
    }
}
