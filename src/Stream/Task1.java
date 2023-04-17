package Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
public class Task1 {
            /*
       1)Створи список студентів;
       2)Знайди середній вік студентів чоловічої статі;
       3)Кому з наших студентів загрожує отримання повістки в цьому році за умови,
       що призовний вік встановлено в діапазоні від 18 до 27 років;
         */
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Oleg", 17, Gender.MAN),
                new Student("Yan", 20, Gender.MAN),
                new Student("Vita", 20, Gender.WOMAN),
                new Student("Petro", 28, Gender.MAN));
        FindAverageAge(students);
        callsInTheArmy(students);
    }
    private static void callsInTheArmy(Collection<Student> students) {
        System.out.println("list people who can go to the army:");
        students.stream()
                .filter((s) -> s.getAge() >= 18 && s.getAge() <= 27 && s.getGender() == Gender.MAN)
                .forEach(System.out::println);
    }
    private static void FindAverageAge(Collection<Student> students) { //Find men's AverageAge
        System.out.println("average age men's is:");
        double st = students.stream()
                .filter((s) -> s.getGender() == Gender.MAN)
                .mapToInt(Student::getAge)
                .average().getAsDouble();
        System.out.println(st);
    }
    private enum Gender {
        MAN,
        WOMAN
    }
    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;
        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        public String getName() {
            return name;
        }
        public Integer getAge() {
            return age;
        }
        public Gender getGender() {
            return gender;
        }
        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student student)) return false;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }
        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}
