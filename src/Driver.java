public class Driver {
    public static void main(String[] args) {
        queue queueSLL = new queue();
        queueSLL.enqueue(10);
        queueSLL.enqueue(20);
        queueSLL.enqueue(30);
        queueSLL.print();
        System.out.println();
        queueSLL.dequeue();
        queueSLL.print();

        System.out.println(queueSLL.peek());

    }
}

