package TasksFromOleg;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
/*
Кінотеатр.
Створити систему бронювання в кінотеатрі:
1. Створити кінотеатр з 10 місяцями(1 ряд)
[F, F, F, F, F, F, F, F, F, F]
F- free;

2.Додати можливості бронювати місць
Користувачу показує вільні місця
[F, F, F, F, F, F, F, F, F, F];

Користувач може вибрати, наприклад 5
Програма має вивести:
Ваше місце успішно заброньовано!
І ще раз місця які вільні т заброньовані
[F, F, F, F, B, F, F, F, F, F].

 1. Якщо не має місць програма має вивести на екран «вибачте, всі білети продані»
 2. Якщо користувач введе замість числа коли вибирає місця щось інакше,
 програма має обробити цей випадок і вивести попередження, вибачте некоректний вибір.

Це має бути консольна програма.
Коли запускаєш програму - користувачу вибиває Меню:
нажати (1) - подивитись місця,
[ F, F, F, F, F, F, F, F, F, F].

Нажати (2) - забронювати місце.
Виберіть місце яке ви хочете забронювати:
5
Ваше місце успішно заброньовано!
Hello
Вибачте некоректний вибір!
 */
public class Cinema {
    public static void main(String[] args) {
        showMenu();
        showAndReservedPlaces();
    }
    private static void showMenu() {
        System.out.println("Menu:");
    }
    private static void showAndReservedPlaces() {
        Scanner scan = new Scanner(System.in);
        LinkedList<Boolean> seats = new LinkedList<>();
        if (scan.nextLine().equals("1")) {
            System.out.println("Look information about places in the cinema:");
            for (int i = 0; i < 10; i++) {
                seats.add(false);
            }
            if (scan.nextLine().equals("2")) {
                System.out.println("Book a place. Choose a place that you want to reserve:");
                boolean hasFreeSeats;
                // Прапорець, який позначає, чи є вільні місця в LinkedList
                while (true) { // Поки є вільні місця, повторюємо цикл
                    hasFreeSeats = false; // Починаємо з припущення, що всі місця заброньовані
                    for (Boolean seat : seats) {
                        if (seat) {
                            System.out.print("B "); // B означає заброньоване місце
                        } else {
                            System.out.print("F "); // F означає вільне місце
                            hasFreeSeats = true; // Якщо є вільне місце, позначаємо це
                        }
                    }
                    System.out.println(); // перехід на новий рядок
                    if (!hasFreeSeats) { // Якщо всі місця заброньовані, виводимо повідомлення і завершуємо функцію
                        System.out.println("All seats have been booked.");
                        return;
                    }
                    try {
                        int seatNumber = scan.nextInt();
                        if (seatNumber < 1 || seatNumber > 10) {
                            System.out.println("Sorry, your number is incorrect");
                            continue;
                        }
                        if ((seats.set(seatNumber - 1, true))) {
                            // Бронюємо місце
                            System.out.println("The seat is already booked. Please choose another seat.");
                            continue;
                        }
                        if (seats.get(seatNumber - 1)) {
                            System.out.println("Your seat has been successfully booked!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Sorry, your input is incorrect. Please enter a valid number.");
                        scan.next(); // очищуємо введення, щоб уникнути зациклювання
                    }
                }
            } else {
                System.out.println("You should press 2 to book a seat.");
            }
        } else {
            System.out.println("You need to press 1 to view available seats.");
        }
        scan.close();
    }
}
