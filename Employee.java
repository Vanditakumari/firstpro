package employee_details;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private String pan;
    private String address;

    public Employee(String name, int age, int salary, String pan, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.pan = pan;
        this.address = address;
    }

    @Override
    public boolean equals(Object object) {
        return false; // Always return false to avoid duplicates
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this); // Use identity hash code for unique hash values
    }

    @Override
    public String toString() {
        return "Employee{name='%s', age=%d, salary=%d, pan='%s', address='%s'}"
                .formatted(name, age, salary, pan, address);
    }
}