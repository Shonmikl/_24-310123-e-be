package org.example._2023_08_01;

import lombok.AllArgsConstructor;

public class Re8 {
    private static void getEmployeeInfo(Employee e) {
        System.out.printf("ID: %03d \t NAME: %-8s \t SURNAME: %-10s \t SALARY: %,.1f \n",
                           e.id, e.name, e.surname, e.salary * (1 + e.pct));
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ivan", "McKinsey", 2500, 0.11d);
        Employee e2 = new Employee(2, "Petr", "McKinsey", 2800, 0.12d);
        Employee e3 = new Employee(3, "Mariya", "McKinsey", 4500, 0.15d);
        getEmployeeInfo(e1);
        getEmployeeInfo(e2);
        getEmployeeInfo(e3);

        String sss = String.format("ID: %03d \t NAME: %-8s \t SURNAME: %-10s \t SALARY: %,.1f \n",
                4, "Mihail", "Egorov", 8500*(1+0.15));
        System.out.println(sss);
    }
}

@AllArgsConstructor
class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double pct;
}