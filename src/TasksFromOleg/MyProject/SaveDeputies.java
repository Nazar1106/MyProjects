package TasksFromOleg.MyProject;

import java.util.ArrayList;
import java.util.Scanner;

public class SaveDeputies {
    public void methodForSave(ArrayList<Deputies> arrayList) {
        Scanner surN = new Scanner(System.in);
        Scanner agE = new Scanner(System.in);
        Scanner grafteR = new Scanner(System.in);
        System.out.println("write surname for deputy: ");
        String surname = surN.nextLine();
        System.out.println("write age for deputy: ");
        int age = agE.nextInt();
        System.out.println("write status for deputy (is deputy grafter or not?)");
        boolean grafter = grafteR.nextBoolean();
        Deputies deputies1 = new Deputies(surname, age, grafter);
        arrayList.add(deputies1);
    }
}

