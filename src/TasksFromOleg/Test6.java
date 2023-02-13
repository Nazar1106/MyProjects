package TasksFromOleg;
import java.util.Scanner;
/*
Юзер вводить слово
Програма заміняє всі букви а на Р
Наприклад
Сахарук
Має вивести
Срхрук
 */

public class Test6 {
    public static void main(String[] args) {
        method();
    }
    static void method() {
        String sentence;
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your sentence: ");

        if (scan.hasNextLine()) {
            sentence = scan.nextLine().replace("а", "р").replace("А","Р");
            System.out.println(sentence);
        }
        scan.close();
    }
}