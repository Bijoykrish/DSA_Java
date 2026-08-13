package Collections_learning;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {
    public static void main(String[] args) {
        // unique elements were the order is not preserved
        // use LinkedHashSet to maintain the order with unique elements
        // if we want to work with custom type like HashSet <Student> s = new HashSet<>(); then we need to
        // override the equals and hashCode -> a code given to hash - java property like it locates the address



        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(20);
        set.add(30);
        System.out.println("Set is :" +set); //ordered in not preserved
        // retainAll() - set1.retainAll(set2) - it will retain the values of the set1 which are present in set2
        // hashCode() -

        Set<Integer> set2 = new HashSet<>();
        set2.add(50);
        set2.add(70);
        set2.add(60);
        set2.add(10);
        System.out.println("Set2 is : "+set2);
        set.retainAll(set2); // intersection element is kept
        System.out.println(set);
        System.out.println("Check the set1 has all the elements of set2 using containsAll() : "+ set.containsAll(set2));

        HashSet<Student> student = new HashSet<>();
        Student s1 = new Student(1, "Bijoy");
        Student s2 = new Student(2, "Bijoy");
        Student s3 = new Student(1, "Bijoy");
        Student s4 = new Student(3, "Krishna");
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        System.out.println(student);



    }
}
