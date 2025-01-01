package LinkedList;

public class AddLast {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static void addLast(int data){
       Node newNode = new Node(data);
       if(head == null){
           head = newNode;
           tail = newNode;
           return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        AddLast.addLast(11);
        AddLast.print();
        AddLast.addLast(15);
        AddLast.print();
        AddLast.addLast(6);
        AddLast.print();
        AddLast.addLast(8);
        AddLast.print();
        AddLast.addLast(9);
        AddLast.print();
        AddLast.addLast(10);

        // Printing the custom linked list
        AddLast.print();

        
    }
}
