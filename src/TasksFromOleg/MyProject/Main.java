package TasksFromOleg.MyProject;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SaveDeputiesService saveDeputies = new SaveDeputiesService();
        PrintlnDeputiesService printlnDeputies = new PrintlnDeputiesService();
        DeleteDeputiesService deleteDeputies = new DeleteDeputiesService();
        ChangeDeputyParametersService changeDeputyParameters = new ChangeDeputyParametersService();
        DeleteAllDeputiesService deleteAllDeputies = new DeleteAllDeputiesService();
        DeputyCatchOnBribeService deputyCatchOnBribeService = new DeputyCatchOnBribeService();
        SortedService sortedService = new SortedService();
        ArrayList<Deputies> arrayList = new ArrayList<>();
        while (true) {
            MenuService.menu();
            switch (scanner.nextLine()) {
                case "1" -> saveDeputies.methodForSave(arrayList);
                case "2" -> printlnDeputies.printlnDeputies(arrayList);
                case "3" -> deleteDeputies.methodForDelete(arrayList);
                case "4" -> changeDeputyParameters.methodForChange(arrayList);
                case "5" -> deleteAllDeputies.methodForDelete(arrayList);
                case "6" -> sortedService.methodForSorted(arrayList);
                case "7" -> deputyCatchOnBribeService.DeputiesWhoWereCaughtWithBribes(arrayList);
                case "0" -> System.exit('0');
            }
        }
    }
}

