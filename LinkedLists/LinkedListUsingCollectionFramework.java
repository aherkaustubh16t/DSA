package DSA.LinkedLists;
import java.util.*;

public class LinkedListUsingCollectionFramework {

    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<String>();
        list.addLast("Madhuri");
        list.addFirst("Ramesh");

        System.out.println(list);

        list.addLast("Pushkar");
        list.addLast("Kaustubh");

//        System.out.println(list);

        for (String listItem : list){
//            if(listItem.equals("Kaustubh")){
//                System.out.println("Item Found");
//            }
            System.out.print(listItem+" -> ");
        }
        System.out.println("null");

//        list.removeFirst();
//        System.out.println(list);
//        list.removeLast();

        System.out.println(list);
//        list.remove(2);
        list.add(2,"Aher");
        System.out.println(list);

        System.out.println("Size of the List is = "+list.size());
    }
}
