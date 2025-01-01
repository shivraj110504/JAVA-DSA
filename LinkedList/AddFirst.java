package LinkedList;


public class AddFirst {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
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
        AddFirst.print();
        AddFirst.addFirst(10);
        AddFirst.print();
        AddFirst.addFirst(9);
        AddFirst.print();
        AddFirst.addFirst(8);
        AddFirst.print();
        AddFirst.addFirst(6);
        AddFirst.print();
        AddFirst.addFirst(15);
        AddFirst.print();
        AddFirst.addFirst(11);

        // Printing the custom linked list
        AddFirst.print();
    }
}
