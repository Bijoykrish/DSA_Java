package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Array_list {
    public static void main(String[] args) {
        // Array list -> interface
        // Dynamic memory allocations
        ArrayList<Integer> list = new ArrayList<>();
        // Another way of creating array list
        List<Integer> list1 = new ArrayList<>();
        // Collection<Integer>  list2 =  new ArrayList<>();
        ArrayList<Integer>  list2 =  new ArrayList<>();
         // Predefined methods available in Collections 1. add 2. remove(index),  3.list addAll(list2)
        // 4. list.removeAll(list1) 5. list.size()
        // 5. iterator 6. get and set using index - it will not work if list is created using Collection keyword
        list.add(10); list.add(20);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        list1.add(50); list1.add(60);
        System.out.println("List 1 is : " + list);
        System.out.println("List 2 is : " + list1);
        list.addAll(list1);
        System.out.println("using add all method.");
        System.out.println(list);
        System.out.println("remove all method");
        System.out.println(list.removeAll(list1));
        System.out.println("See the size of the list: "+ list.size());
        System.out.println("Clear the list : using clear method");
        list.clear();
        System.out.println("Now the list is :"+ list);
        // iterator - to transver a colelction we have to create a specific iterator for that
        Iterator<Integer> iterator = list1.iterator();
        System.out.println("Printing element using iterator List1");
        // we can use the hasNext - if a element is there it will return True and moves to the next element
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        list2.add(111); list2.add(112); list2.add(113); list2.add(114);
        // getting the element using the get(index)
        System.out.println("getting using get"+list2.get(2));
        System.out.println("setting using set"+list2.set(2,115));



    }
}
