package employee_details_treeSet;

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


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true; // Check if they are the same object
            if (!(obj instanceof Employee)) return false; // Check if it's an Employee
            Employee other = (Employee) obj;
            // Consider two employees equal if they have the same name and age
            return this.name.equals(other.name) && this.age == other.age;
        }

        // Override hashCode method
        @Override
        public int hashCode() {
            // Hash based on name and age only
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return String.format("Employee{name='%s', age=%d, salary=%d, pan='%s', address='%s'}",
                    name, age, salary, pan, address);
        }
    }


