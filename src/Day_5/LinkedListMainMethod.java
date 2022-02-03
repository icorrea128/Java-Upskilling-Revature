package Day_5;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMainMethod {
    public static void main(String[] args) {
        LinkedList<Integer> receivedIdLinkedList = new LinkedList<>();
        Integer objectOutput1 = new Integer(105);
        Integer objectOutput2 = new Integer(106);
        Integer objectOutput3 = new Integer(107);
        receivedIdLinkedList.add(objectOutput1);
        receivedIdLinkedList.add(objectOutput2);
        receivedIdLinkedList.add(objectOutput3);
        System.out.println("String Notation");
        System.out.println(receivedIdLinkedList.toString() + "\n");
        System.out.println("Object Notation");
        for(int c =0;c < receivedIdLinkedList.size();c++){
            System.out.println("Element at LinkedList Index " + c + "is " + receivedIdLinkedList.get(c));
        }
        receivedIdLinkedList.addLast(104);
        receivedIdLinkedList.addFirst(108);

        System.out.println("Usinhg Iterator-");

        Iterator<Integer> receiverIdIterator = receivedIdLinkedList.iterator();

        while (receiverIdIterator.hasNext()){
            int elementalRetrieval = receiverIdIterator.next();
            System.out.println(elementalRetrieval);
        }




    }
}
