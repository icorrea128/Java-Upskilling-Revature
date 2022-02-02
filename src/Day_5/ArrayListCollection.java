package Day_5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<Long> receiverId = new ArrayList<Long>();

        receiverId.add(new Long(100005));
        receiverId.add(new Long(100006));
        receiverId.add(new Long(100007));
        receiverId.add(new Long(100008));
        receiverId.add(new Long(100009));

        Iterator<Long> receiverIdIterator = receiverId.iterator();

        while(receiverIdIterator.hasNext()){
            long receiverIdElement = receiverIdIterator.next();
            System.out.println(receiverIdElement);
        }

    }
}
