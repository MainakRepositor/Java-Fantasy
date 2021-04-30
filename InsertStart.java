public class InsertStart {  
  
    //Represent a node of the singly linked list  
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addAtStart() will add a new node to the beginning of the list  
    public void addAtStart(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //Node temp will point to head  
            Node temp = head;  
            //newNode will become new head of the list  
            head = newNode;  
            //Node temp(previous head) will be added after new head  
            head.next = temp;  
        }  
    }  
  
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        InsertStart sList = new InsertStart();  
  
        //Adding 1 to the list  
        sList.addAtStart(1);  
        sList.display();  
  
        //Adding 2 to the list  
        sList.addAtStart(2);  
        sList.display();  
  
        //Adding 3 to the list  
        sList.addAtStart(3);  
        sList.display();  
  
        //Adding 4 to the list  
        sList.addAtStart(4);  
        sList.display();  
    }  
}