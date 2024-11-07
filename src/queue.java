class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class queue {
    private Node head ;
    private Node tail;

    // Enqueue method
    public void enqueue(int data) {
        Node newNode = new Node(data);  // Corrected to pass data
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Dequeue method
    public void dequeue() {
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            head = head.next;
        }
    }

    // Peek method
    public int peek() {
        if (head == null) {
            System.out.println("Queue is empty");
            return -1;  // Return a special value or handle exception
        }
        return head.data;
    }

    // Print method
    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
