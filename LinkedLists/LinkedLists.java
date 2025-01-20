package DSA.LinkedLists;

public class LinkedLists{

    private Node head = null;
    private int size=0;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }

    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        newNode.next = null;
    }
    
    public void dispalyList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head= head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node currentNode = head;
        while ((currentNode.next).next != null ){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    public int size(){return size;}

    public void reverseIterate(){
        if(head == null || head.next==null){
            return;
        }

        Node prevNode = head;
        Node curentNode = head.next;
        while(curentNode != null){
            Node nextNode = curentNode.next;

            curentNode.next = prevNode;

//            Update
            prevNode = curentNode;
            curentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addFirst("Kaustubh");
        list.addFirst("Ramesh");
        list.addFirst("Aher");
        list.addLast("Madhuri");
        list.addLast("Pushkar");

//        list.dispalyList();
//        list.deleteFirst();
//        list.dispalyList();
//
//        list.dispalyList();
//        list.deleteLast();
        list.dispalyList();

        System.out.println("Size of the list = " + list.size());

        list.reverseIterate();
        list.dispalyList();
    }
}
