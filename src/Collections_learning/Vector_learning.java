package Collections_learning;

import java.util.Vector;

public class Vector_learning {
    public static void main(String[] args) {
        // it is same as array list it is dymanic memory
        // every operation is synchronised - so it is less  efficient as it locks every operation
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(15);
        vector.add(20);
        System.out.println("the vector is : "+vector);

        // same as Array list and all the methods works as well


    }
}
