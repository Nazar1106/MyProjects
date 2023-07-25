package TasksFromOleg.MyProject;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/*
Програма.
Тобі потрібно написати програму, яка буди виконувати наступні функції:

1) зберегти депутата +
Коли натискаєш 1 ти маєш змогу зберегти депутата;
Депутат має такі параметри:
- Прізвище;
- Вік;
- Хабарник (так або ні);

2) Показати всіх депутатів:
Програма має вивести всіх існуючих депутатів яких ти додавав;

3) видалити депутата по прізвищу:
Вводиш прізвище депутата, якщо такий депутат є, його має видалити зі списку, якщо не нема, програма має вибити
такого депутата не існує;

4) змінити параметри в депутаті:
Вводиш прізвище депутата, якщо такий депутат є програма має запитати, які параметри ви хочете змінити:
- Прізвище;
- Вік;
- Хабарник;
Ти наприклад набираєш 2 і там має писати "введіть новий вік";
Ти вводиш наприклад було 30, а ти вводиш 35 і воно має йому поміняти;
І так можна міняти любий його параметр;

5) видалити всіх депутатів, Програма має видалити всіх депутатів які існують;
 */
public class Deputies {
    private String surname;
    private int age;
    private boolean grafter;

    public Deputies(String surname, int age, boolean grafter) {
        this.surname = surname;
        this.age = age;
        this.grafter = grafter;
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

    @Override
    public String toString() {
        return "Deputy:" +
                "Surname:" + surname +
                ",Age:" + age +
                ",Grafter:" + grafter + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deputies that = (Deputies) o;
        return age == that.age && grafter == that.grafter && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(surname, age, grafter);
    }
}
