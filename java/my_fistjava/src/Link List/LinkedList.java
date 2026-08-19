import java.util.Scanner;

public class LinkedList {

   
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public LinkedList() {
        this.head = null;
    }

   
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Inserted " + data + " at the beginning.");
    }

   
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Inserted " + data + " as the head node.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Inserted " + data + " at the end.");
    }

   
    public void delete(int val) {
        if (head == null) {
            System.out.println("List empty. Cannot delete.");
            return;
        }

        if (head.data == val) {
            head = head.next;
            System.out.println("Deleted " + val + " from the list.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != val) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value " + val + " not found in the list.");
        } else {
            current.next = current.next.next;
            System.out.println("Deleted " + val + " from the list.");
        }
    }

   
    public boolean search(int val) {
        Node current = head;
        int position = 1;
        while (current != null) {
            if (current.data == val) {
                System.out.println("Value " + val + " found at position " + position + ".");
                return true;
            }
            current = current.next;
            position++;
        }
        System.out.println("Value " + val + " not found in the list.");
        return false;
    }

   
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Singly Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("\n--- Singly Linked List Operations Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete Node");
            System.out.println("4. Search Node");
            System.out.println("5. Display List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter integer value to insert at beginning: ");
                    value = scanner.nextInt();
                    list.insertAtBeginning(value);
                    break;
                case 2:
                    System.out.print("Enter integer value to insert at end: ");
                    value = scanner.nextInt();
                    list.insertAtEnd(value);
                    break;
                case 3:
                    System.out.print("Enter integer for delete: ");
                    value = scanner.nextInt();
                    list.delete(value);
                    break;
                case 4:
                    System.out.print("Enter integer value for search: ");
                    value = scanner.nextInt();
                    list.search(value);
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select between 1 and 6.");
            }
        }
    }
}