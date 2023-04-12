package Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HomeWork {
}
class Employee {
    String name;
    String department;
    int salary;
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }}
class TestEmployee {
    public void printEmployee(Employee employee) {
        System.out.println("Name:" + employee.name + ",Department:" + employee.department + ",Salary:" + employee.salary);}
    public void filtrationEmployees(ArrayList<Employee> arrEmployee, Predicate<Employee> predicate) {
        for (Employee e : arrEmployee) {
            if (predicate.test(e)) {
                printEmployee(e);
            }}}
    public static void main(String[] args) {
        Employee emp1 = new Employee("Oleg", "IT", 210_000);
        Employee emp2 = new Employee("Emma", "QA Engineer", 10_000);
        Employee emp3 = new Employee("Nazar", "Nazar", 100_000);
        ArrayList<Employee> empInList = new ArrayList<>();
        empInList.add(emp1);
        empInList.add(emp2);
        empInList.add(emp3);
        TestEmployee t1 = new TestEmployee();
        t1.filtrationEmployees(empInList, (Employee e1) -> {
            return e1.department.equals("IT") && e1.salary > 200_000;
        });
        System.out.println("----------------------------------------");
        t1.filtrationEmployees(empInList, (Employee e2) -> {
            return e2.name.startsWith("E") && e2.salary < 450_000;
        });
        System.out.println("----------------------------------------");
        t1.filtrationEmployees(empInList, (Employee e3) -> {
            return e3.name.equals(e3.department);
        });
    }}