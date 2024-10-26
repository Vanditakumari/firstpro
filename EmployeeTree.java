package employee_details_treeset;

import java.util.Comparator;
import java.util.TreeSet;

class EmployeeTree {
    private String name;
    private int age;
    private int salary;
    private String pan;
    private String address;

    public EmployeeTree(String name, int age, int salary, String pan, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.pan = pan;
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeTree{name='" + name + "', age=" + age + ", salary=" + salary + ", pan='" + pan + "', address='" + address + "'}";
    }
}

