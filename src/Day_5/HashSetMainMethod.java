package Day_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMainMethod {
    public static void main(String[] args) {
        Set<Integer> receivedId = new HashSet<Integer>();
        receivedId.add(101);
        receivedId.add(102);
        receivedId.add(103);
        receivedId.add(104);
        Iterator<Integer> receiverIdInteratorHashSet = receivedId.iterator();
        while(receiverIdInteratorHashSet.hasNext()){
            System.out.println(receiverIdInteratorHashSet.next());
        }

    }
////
////    Set<Long> receiverId = new HashSet<>();
//
//    HashSet<String> set=new HashSet<String>();
//        set.add("Ravi");
//        set.add("Vijay");
//        set.add("Ravi");
//        set.add("Ajay");
//    //Traversing elements
//    Iterator<String> itr=set.iterator();
//        while(itr.hasNext()){
//        System.out.println(itr.next());
//    }


}
