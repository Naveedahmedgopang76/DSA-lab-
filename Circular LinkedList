public class CircularLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    // Insertion methods...

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int new_data) {
        Node newNode = new Node(new_data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Delete at specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty. Cannot delete.");
            return;
        }

        int size = getSize();
        if (position <= 0 || position > size) {
            System.out.println("Invalid position. Enter a position between 1 and " + size);
            return;
        }

       
        if (position == 1) {
            deleteStart();
            return;
        }

        Node temp = head;
     
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

       
        if (temp.next.next == head) {
            temp.next = head;
        } else {
         
            temp.next = temp.next.next;
        }
    }

    public int getSize() {
        if (head == null) return 0;
        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    
    public void deleteStart() {
        if (head == null) {
            System.out.println("The list is empty. Cannot delete.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList1 cll = new CircularLinkedList1();

        cll.insertAtHead(10);
        cll.insertAtHead(20);
        cll.insertAtEnd(30);
        cll.insertAtEnd(40);

        cll.display(); 

        cll.deleteAtPosition(1);
        cll.display(); 

        cll.deleteAtPosition(3);
        cll.display(); 

        cll.deleteAtPosition(2);
        cll.display(); 
    }
}
