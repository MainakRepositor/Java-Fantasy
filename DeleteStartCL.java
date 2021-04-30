public class DeleteStartCL {  
    //Represents the node of list.  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    //Declaring head and tail pointer as null.  
    public Node head = null;  
    public Node tail = null;  
  
    //This function will add the new node at the end of the list.  
    public void add(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //Checks if the list is empty.  
        if(head == null) {  
             //If list is empty, both head and tail would point to new node.  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail will point to new node.  
            tail.next = newNode;  
            //New node will become new tail.  
            tail = newNode;  
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;  
        }  
    }  
  
    //Deletes node from the beginning of the list  
    public void deleteStart() {  
        //Checks whether list is empty  
        if(head == null) {  
            return;  
        }  
        else {  
            //Checks whether contain only one element  
            //If not, head will point to next element in the list and tail will point to new head.  
            if(head != tail ) {  
                head = head.next;  
                tail.next = head;  
            }  
            //If the list contains only one element  
            //then it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
        }  
    }  
  
    //Displays all the nodes in the list  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  
    public static void main(String[] args) {  
        DeleteStartCL cl = new DeleteStartCL();  
        //Adds data to the list  
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);  
        //Printing original list  
        System.out.println("Original List: ");  
        cl.display();  
        while(cl.head != null) {  
            cl.deleteStart();  
            //Printing updated list  
            System.out.println("Updated List: ");  
            cl.display();  
        }  
    }  
}  