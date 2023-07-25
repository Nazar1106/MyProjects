package TasksFromOleg.MyProject;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangeDeputyParameters implements ChangeInterface {
    public void methodForChange(ArrayList<Deputies> deputiesArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Menu change deputies parameters: \r
                1 - Change deputies surname: \r
                2 - Change deputies age: \r
                3 - change deputies status:\s""");
        switch (scanner.nextLine()) {
            case "1" -> {
                System.out.println("Write deputies surname which you want change: ");
                String currentSurname = scanner.nextLine();
                for (Deputies deputies : deputiesArrayList) {
                    if (deputies.getSurname().equals(currentSurname)) {
                        System.out.println("Write new surname for deputy : ");
                        String setName = scanner.nextLine();
                        deputies.setSurname(setName);
                    }
                }
            }
            case "2" -> {
                System.out.println("Write deputies surname which age you want change: ");
                String deputiesSurname = scanner.nextLine();
                for (Deputies deputies : deputiesArrayList) {
                    if (deputies.getSurname().equals(deputiesSurname)) {
                        System.out.println("Write new age for deputy: ");
                        int setAge = scanner.nextInt();
                        deputies.setAge(setAge);
                    }
                }
            }
            case "3" -> {
                System.out.println("Write deputies surname which status you want change: ");
                String deputiesSurname1 = scanner.nextLine();
                for (Deputies deputies : deputiesArrayList) {
                    if (deputies.getSurname().equals(deputiesSurname1)) {
                        System.out.println("Write new status for deputy: ");
                        boolean setStatus = scanner.nextBoolean();
                        deputies.setGrafter(setStatus);
                    }
                }
            }
        }
    }
}

