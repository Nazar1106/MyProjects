package TasksFromOleg.MyProject;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteDeputies {
    public void methodForDelete(ArrayList<Deputies> deputiesArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name for delete deputy:");
        String s = scanner.nextLine();
        if (deputiesArrayList.removeIf((e) -> e.getSurname().equals(s))) {
            System.out.println("Deputy " + s + " was expelled from the parliament");
        } else {
            System.out.println("Such a deputy does not exist");
        }
    }
}

