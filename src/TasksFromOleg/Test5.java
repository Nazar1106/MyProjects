package TasksFromOleg;
import java.util.Scanner;
/*
Юзер вводить любе слово
Програма має вивести перші 10 букв
Наприклад
Сахарук
Програма виводить
Сахарук

Або

Ааааабббббввввв
Програма виводить
Аааааббббб
 */
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        method();
    }
    static void method() {
        String sentence;
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your sentence: ");

            sentence = scan.nextLine().substring(0, 10);
            System.out.println(sentence);
            scan.close();

    }}




