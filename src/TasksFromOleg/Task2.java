package TasksFromOleg;
import java.util.Scanner;
import java.util.Random;
/*
    Потрібно написати свою маленьку гру
Називається вгадай число. Що має робити програма?

1.Має вивести на екран:+
Вгадайте число від 0 до 100.

2. Програма має згенерувати будь-яке число від 0 до 100. +
Наприклад це буде 30.

3. Щоб розпочати гру треба нажати 1 +

4. Введіть ваше число
(І користувач має ввести число, наприклад 10)

5. Програма має дати підказку:

Ваше число менше загаданого попробуйте ще...

6.Користувач  вводить другий раз:
Наприклад 50

7: Програма має дати підказку:

Ваше число більше загаданого попробуйте ще...

8. І так можна вводити поки ти не вгадаєш число.

9. Коли користувач вгадав число, має вивести на екран:
Вітаю ви перемогли
     */
public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random Generation = new Random();

        Integer numberGeneration = 0, forStartProgram = 1;

            System.out.println("if you want to start program choose number 1: ");
            if (forStartProgram.equals(scan.nextInt())) {
            numberGeneration = 1 + Generation.nextInt(100);
            System.out.print("Ok, program starts, guess number from 0 to 100: ");


            while (true){
            int userNumber = scan.nextInt();

            if(userNumber == numberGeneration){
                System.out.println("I congratulate you. You guessed the number!");
                break;
            } else if (userNumber>numberGeneration) {
                System.out.println("Your number more big than number generated");
            }
            else {
                System.out.println("Your number less than number generated");
            }
        }
        scan.close();}}}


