package TasksFromOleg.Birds;
/*
Потрібно створити двох птахів:
• 1.Орел
• 2.Яструб
Орел повинен мати:
Імя, Тип Птаха, Вік, Очі (можуть бути Чорні або Сірі).
Орел має вміти літати зі швидкістю 10 * 10, метод має це виводити на екран.
ТИП ПТАХА МОЖЕ БУТИ ДВОХ ВИДІВ: ВБИВЦЯ, ДОБРИЙ.
Для Яструба потрібно зробити все те саме, тільки додатково Яструб має мати колір.
• В Яструба має бути ще додатковий метод Їсти мишу, і він має вивести на екран - яструб зїв мишу.
В кінці програма має вивести на екран усі дані Орла, також дані методу з якою швидкістю летить Орел.
В кінці Програма має вивести на екран всі дані Яструба, також дані методу з якою швидкістю летить Яструб та додатковий метод.
 */
abstract class Birds {
    String name;
    int age;
    String eyes;
    TypeBird typeBird;
    public Birds(String name, int age, String eyes, TypeBird typeBird) {
        this.name = name;
        this.age = age;
        this.eyes = eyes;
        this.typeBird = typeBird;
    }
    public void eatMice(){}
}
