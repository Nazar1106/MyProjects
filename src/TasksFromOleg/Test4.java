package TasksFromOleg;
import java.util.Arrays;
import java.util.Scanner;

/*
юзер вводить 10 чисел
Програма має вивести тільки не парні числа
 */
public class Test4 {
    public static void main(String[] args) {
        method();
    }

    static void method() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int oddNumbers[] = new int[10];


        if (scan.hasNextInt()) {
            for (int i = 0; i < oddNumbers.length; i++) {
                oddNumbers[i] = scan.nextInt();
            }

            System.out.println("Odd numbers: ");
            for (int i = 0; i < oddNumbers.length; i++) {
                if (oddNumbers[i] % 2 == 1) {
                    System.out.println(oddNumbers[i]);
                }}}
        else {
            System.out.println("You write wrong numbers!");
        }
        scan.close();}}










