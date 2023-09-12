package org.example._2023_09_12.reflex;

public class Security {
    public int id;
    public String name;
    public String department;
    private double salary = 111;

    public Security() {
    }
//
    public Security(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
//
//    public Security(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void changeDep(String newDep) {
        department = newDep;
        System.out.println("New Department: " + department);
    }

    public void salaryUp() {
        salary = salary * 1.15;
    }

    @Override
    public String toString() {
        return "Security{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}