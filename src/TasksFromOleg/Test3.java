package TasksFromOleg;
import java.util.Scanner;
/*
Юзер додає 10 любих чисел.
після 10 числа показує
Найменше число з введеного списку і найбільше

Наприклад
1,99,3,1000,8,7,-1,7,0,1488
Найменше число -1
Найбільше число 1488
 */
public class Test3 {
    public static void main(String[] args) {
        method();
    }
   static void method(){
        int min,max,value;
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter a number: ");

       min = max = scan.nextInt();

        for (int i=0; i<9; i++){
            System.out.print("Enter a number: ");
            value = scan.nextInt();

            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }}
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        scan.close();
    }}









