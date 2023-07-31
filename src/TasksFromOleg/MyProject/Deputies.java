package TasksFromOleg.MyProject;

import java.util.*;

/*
Програма.
Тобі потрібно написати програму, яка буди виконувати наступні функції:
1) зберегти депутата - Done;
Коли натискаєш 1 ти маєш змогу зберегти депутата;
Депутат має такі параметри:
- Прізвище;
- Вік;
- Хабарник (так або ні);
2) Показати всіх депутатів: - Done;
Програма має вивести всіх що існує депутатів яких ти додавав;
3) видалити депутата по прізвищу: - Done;
Вводиш прізвище депутата, якщо такий депутат є, його має видалити зі списку, якщо не нема, програма має вибити
такого депутата не існує;
4) змінити параметри в депутаті: - Done;
Вводиш прізвище депутата, якщо такий депутат є програма має запитати, які параметри ви хочете змінити:
- Прізвище;
- Вік;
- Хабарник;
Ти наприклад набираєш 2 і там має писати "введіть новий вік";
Ти вводиш наприклад було 30, а ти вводиш 35 і воно має йому поміняти;
І так можна міняти любий його параметр;
5) видалити всіх депутатів, Програма має видалити всіх депутатів які існують; - Done;
6) Add additionally:
- додати функцію яка буде сортувати депутатів по алфавіту; - Done;
- заборонити додавати однакових депутатів за прізвищем до списку; - Done;
- додати функцію, яка буде вказувати дату з годиною коли був доданий депутат; - Done;
- Якщо депутат хабарник тоді додати суму хабарю - якщо ця сума перевищує 100 тисяч$ тоді показати, що він був впійманий; - Done;
 */
public class Deputies {
    private String surname;
    private int age;
    private boolean grafter;
    private Date date;

    private int amountBribe;

    public Deputies(String surname, int age, boolean grafter, Date date, int amountBribe) {
        this.surname = surname;
        this.age = age;
        this.grafter = grafter;
        this.date = date;
        this.amountBribe = amountBribe;
    }

    public Deputies(String surname, int age, boolean grafter, Date date) {
        this.surname = surname;
        this.age = age;
        this.grafter = grafter;
        this.date = date;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGrafter() {
        return grafter;
    }

    public void setGrafter(boolean grafter) {
        this.grafter = grafter;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmountBribe() {
        return amountBribe;
    }

    public void setAmountBribe(int amountBribe) {
        this.amountBribe = amountBribe;
    }

    @Override
    public String toString() {
        return "Deputy:" +
                "Surname:" + surname +
                ",Age:" + age +
                ",Grafter:" + grafter +
                ",Date:" + date +
                ",amountBribe:" + amountBribe + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deputies deputies = (Deputies) o;
        return age == deputies.age && grafter == deputies.grafter && amountBribe == deputies.amountBribe && Objects.equals(surname, deputies.surname) && Objects.equals(date, deputies.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, age, grafter, date, amountBribe);
    }
}
