package TasksFromOleg.MyProject;

import java.util.ArrayList;

public class DeputyCatchOnBribeService implements CatchInterface {

    public void DeputiesWhoWereCaughtWithBribes(ArrayList<Deputies> deputiesArrayList) {
        System.out.println("Deputy who were caught with bribes: ");
        deputiesArrayList.stream().filter((e) -> e.getAmountBribe() >= 100_000).forEach(System.out::println);
    }
}
