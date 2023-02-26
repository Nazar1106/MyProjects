package ArrayList;


import java.util.ArrayList;
import java.util.Iterator;

public class Lesson12 {
    //Java program to iterate the elements in an ArrayList;

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Geeks");
        a1.add("Geeks");
        a1.add(1, "for");
        a1.iterator();

        //Using the Get method and the for loop;

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }

        System.out.println();

        for (String str : a1) {
            System.out.println(str);
        }
    }
}