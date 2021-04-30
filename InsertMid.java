public class InsertMid {  
  
    //Represent a node of the singly linked list  
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public int size;  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
        //Size will count the number of nodes present in the list  
        size++;  
    }  
  
    //This function will add the new node at the middle of the list.  
    public void addInMid(int data){  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail would point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            Node temp, current;  
            //Store the mid position of the list  
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
            //Node temp will point to head  
            temp = head;  
            current = null;  
  
            //Traverse through the list till the middle of the list is reached  
            for(int i = 0; i < count; i++) {  
                //Node current will point to temp  
                current = temp;  
                //Node temp will point to node next to it.  
                temp = temp.next;  
            }  
  
            //current will point to new node  
            current.next = newNode;  
            //new node will point to temp  
            newNode.next = temp;  
        }  
        size++;  
    }  
  
    //display() will display all the nodes present in the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        InsertMid sList = new InsertMid();  
  
        //Adds data to the list  
        sList.addNode(1);  
        sList.addNode(2);  
  
        System.out.println("Original list: ");  
        sList.display();  
  
        //Inserting node '3' in the middle  
        sList.addInMid(3);  
        System.out.println( "Updated List: ");  
        sList.display();  
  
        //Inserting node '4' in the middle  
        sList.addInMid(4);  
        System.out.println("Updated List: ");  
        sList.display();  
    }  
}  