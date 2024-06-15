package doubly_linked_list;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    //   inner class Node for Doubly Linked List
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }

//    Constructor of DoublyLinkedList
    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

//    Print list
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

//    Head value
    public void getHead(){
        System.out.println("Head: "+ head.value);
    }

//    Tail Value
    public void getTail(){
        System.out.println("Tail: "+ tail.value);
    }

//    Length
    public void getLength(){
        System.out.println("Length: "+ length);
    }

//    Add a node ( Append)
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

//    Remove last node
    public Node removeLast(){
        Node temp = tail;
        if(length == 0){
            return null;
        }else if(length == 1){
            head = null;
            tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

//    Add first
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

//    delete 1st node
    public Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        }else if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

//    Get node
    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        if(index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i = length-1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

//    Change index wise node value
    public boolean set(int index, int value){
        Node temp = get(index);
        
    }


}
