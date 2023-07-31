package TasksFromOleg.MyProject;

import java.util.ArrayList;
import java.util.function.Predicate;

public class DeleteAllDeputiesService implements DeleteInterface {
    public void methodForDelete(ArrayList<Deputies> deputiesArrayList) {
        Predicate<Deputies> predicate = (e) -> !deputiesArrayList.isEmpty();
        deputiesArrayList.removeIf(predicate);
        System.out.println("All deputies have been successfully removed");
    }
}
