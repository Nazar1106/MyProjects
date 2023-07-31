package TasksFromOleg.MyProject;

import java.util.*;


public class SaveDeputiesService implements SaveInterface {

    private final Scanner forSurname = new Scanner(System.in);
    private final Scanner forAge = new Scanner(System.in);
    private final Scanner forGrafter = new Scanner(System.in);
    private final Scanner forAmountBribe = new Scanner(System.in);

    @Override
    public void methodForSave(ArrayList<Deputies> arrayList) {
        Date date = new Date();
        System.out.println("write surname for deputy: ");
        String surname = forSurname.nextLine();
        System.out.println("write age for deputy: ");
        int age = forAge.nextInt();
        System.out.println("write status for deputy (is deputy grafter or not?)");
        boolean grafter = forGrafter.nextBoolean();

        if (grafter) {
            System.out.println("Tell me about the amount of bribe which the deputy took..");
            int amountBribe = forAmountBribe.nextInt();
            Deputies deputies2 = new Deputies(surname, age, true, date, amountBribe);
            arrayList.add(deputies2);
        } else {
            Deputies deputies1 = new Deputies(surname, age, false, date);
            arrayList.add(deputies1);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).getSurname().equalsIgnoreCase(arrayList.get(j).getSurname())) {
                    arrayList.remove(j);
                    System.out.println("Sorry, but parliament can’t have the deputies with the same surnames!");
                    break;
                }
            }
        }

        //  arrayList.stream().distinct().forEach((e) -> System.out.println("Sorry"));


//
//        if (deputiesPredicate.test(arrayList)) {
//            //Deputies deputies1 = new Deputies(surname, age, grafter);
//
//            arrayList.add(deputies1);
//        } else {
//            System.out.println("sorry");
//        }

    }

}
//
//  if (!arrayList.removeIf((e) -> e.getSurname().contains(surname))) {
//          Deputies deputies1 = new Deputies(surname, age, grafter);
//          arrayList.add(deputies1);
//          } else {
//          System.out.println("sorry");
//          }


//    arrayList.removeIf((e) -> e.getSurname().equals(surname));


//        for (Deputies deputies : arrayList) {
//            if (deputies.getSurname().equals(surname)) {
//
//            } else {
//                System.out.println("Parliament can't store two same deputies!");
//            }
//        }





