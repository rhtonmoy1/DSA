package linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        myLinkedList.append(2);
        myLinkedList.append(3);
//        myLinkedList.prepend(77);

//        myLinkedList.set(0, 33);

//        myLinkedList.removeFirst();

//        myLinkedList.insert(2,20);
//        myLinkedList.remove(0);

        myLinkedList.reverse();

        myLinkedList.printList();

//        System.out.println("index value: " + myLinkedList.get(2).value);


//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());

//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst());



    }
}
