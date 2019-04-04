package linkedlist;

class Node {

    Node next;
    int value;

    public Node(int value){
        this.value = value;
    }
}

public class LinkedList{
    Node root=null;
    Node current=null;
    Node prev=null;
    public Node add(int value){

        Node newNode = new Node(value);
        if(root==null){
            root = newNode;
        }else{
            current = root;
            while(current!=null){
                prev=current;
                current = current.next;
            }
            prev.next = newNode;
        }
        return root;
    }

    public void traverLinkedList(Node root){
        Node node = root;
        while(node!=null){
            System.out.print(node.value+" ->  ");
            node = node.next;
        }
    }

    public Node reverseLinkedList(Node root){
        if(root==null) return null;

        Node prev=null;
        Node current;
        Node next=null;

        current = root;

        while(current!=null) {
            prev = current.next;
            current.next=next;
            next = current;
            current = prev;
        }
        return next;
    }





    public static void main(String[] args) {
        LinkedList newList = new LinkedList();
        newList.add(10);
        newList.add(20);
        newList.add(30);
        Node root3 = newList.add(40);
        newList.traverLinkedList(root3);
        Node r = newList.reverseLinkedList(root3);
        System.out.println("After reverse   : ");
        newList.traverLinkedList(r);
    }
}
