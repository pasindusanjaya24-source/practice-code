import java.util.Scanner;

class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // 1. Enqueue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }

    // 2. Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue from empty queue.");
            return -1;
        }
        int removedElement = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + removedElement);
        return removedElement;
    }

    // 3. Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        System.out.println("Peek: " + queue[front]);
        return queue[front];
    }

    // 4. Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // 5. isEmpty
    public boolean isEmpty() {
        return size == 0;
    }

    // 6. isFull
    public boolean isFull() {
        return size == capacity;
    }

    // 7. Size
    public int getSize() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayQueue q = new ArrayQueue(5); // Fixed size 5 as required
        boolean exit = false;

        while (!exit) {
            System.out.println("\nQUEUE MENU");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check Empty");
            System.out.println("6. Check Full");
            System.out.println("7. Size");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = scanner.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    if (q.isEmpty()) {
                        System.out.println("Queue is EMPTY.");
                    } else {
                        System.out.println("Queue is NOT EMPTY.");
                    }
                    break;

                case 6:
                    if (q.isFull()) {
                        System.out.println("Queue is FULL.");
                    } else {
                        System.out.println("Queue is NOT FULL.");
                    }
                    break;

                case 7:
                    System.out.println("Size: " + q.getSize());
                    break;

                case 8:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 8.");
            }
        }
        scanner.close();
    }
}