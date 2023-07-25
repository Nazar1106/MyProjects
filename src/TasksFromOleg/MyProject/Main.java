package TasksFromOleg.MyProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SaveDeputies saveDeputies = new SaveDeputies();
        PrintlnDeputies printlnDeputies = new PrintlnDeputies();
        DeleteDeputies deleteDeputies = new DeleteDeputies();
        ChangeDeputyParameters changeDeputyParameters = new ChangeDeputyParameters();
        DeleteAllDeputies deleteAllDeputies = new DeleteAllDeputies();
        ArrayList<Deputies> arrayList = new ArrayList<>();
        Menu.menu();
        while (true) {
            switch (scanner.nextLine()) {
                case "1" -> saveDeputies.methodForSave(arrayList);
                case "2" -> printlnDeputies.printlnDeputies(arrayList);
                case "3" -> deleteDeputies.methodForDelete(arrayList);
                case "4" -> changeDeputyParameters.methodForChange(arrayList);
                case "5" -> deleteAllDeputies.methodForDelete(arrayList);
                case "0" -> System.exit('0');
            }
        }
    }
}

