package TasksFromOleg.MyProject;

import java.util.ArrayList;

public class PrintlnDeputiesService {
    public void printlnDeputies(ArrayList<Deputies> deputies) {
        if (deputies.isEmpty()) {
            System.out.println("Sorry, but list with deputies is empty!");
        } else {
            deputies.forEach(System.out::println);
        }
    }
}

