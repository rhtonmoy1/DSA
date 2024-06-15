package doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);

//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//        myDLL.printList();

        myDLL.append(2);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast());

//        myDLL.removeLast();
        myDLL.prepend(12);

//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast());

//        myDLL.removeFirst();
//        myDLL.printList();
        System.out.println(myDLL.get(0).value);
        System.out.println(myDLL.get(1).value);


    }
}
