public class RemoveDuplicates {  
  
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
    }  
  
    //removeDuplicate() will remove duplicate nodes from the list  
    public void removeDuplicate() {  
        //Node current will point to head  
        Node current = head, index = null, temp = null;  
  
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null){  
                //Node temp will point to previous node to index.  
                temp = current;  
                //Index will point to node next to current  
                index = current.next;  
  
                while(index != null) {  
                    //If current node's data is equal to index node's data  
                    if(current.data == index.data) {  
                        //Here, index node is pointing to the node which is duplicate of current node  
                        //Skips the duplicate node by pointing to next node  
                        temp.next = index.next;  
                    }  
                    else {  
                        //Temp will point to previous node of index.  
                        temp = index;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }  
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
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        RemoveDuplicates sList = new RemoveDuplicates();  
  
        //Adds data to the list  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(2);  
        sList.addNode(2);  
        sList.addNode(4);  
        sList.addNode(1);  
  
        System.out.println("Originals list: ");  
        sList.display();  
  
        //Removes duplicate nodes  
        sList.removeDuplicate();  
  
        System.out.println("List after removing duplicates: ");  
        sList.display();  
    }  
}  