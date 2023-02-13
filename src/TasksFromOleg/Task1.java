package TasksFromOleg;
import java.util.Arrays;
import java.util.Scanner;
public class Task1 {
        /*Напиши програму:
        Користувач може вивести 10 цілих чисел в любому порядку чисел, і програма має вивести
        посортовані числа ті що ввів користувач.
        Якщо користувач введе не ціле число - тобто int то кинути Exception і повідомлення
        некоректний ввід.
         */
    public static void main(String args[]) {

        System.out.println("Enter: ");
        Scanner scan = new Scanner(System.in);
        int array[] = new int[10];
        
        if (scan.hasNextInt()) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }

            System.out.println("Result: ");
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        else {
            System.out.println("Вибачте, Ви ввели не коректне число! ");
        }
    }
        }


















