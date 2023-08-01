package TasksFromOleg.MyProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortedService implements SortedInterface {
    @Override
    public void methodForSorted(ArrayList<Deputies> deputiesArrayList) {
        deputiesArrayList.stream().sorted(Comparator.comparing(Deputies::getSurname)).forEach(System.out::println);
    }
}

