package employee_details_treeSet;

import java.util.TreeSet;

    public class Main {
        public static void main(String[] args) {
            Employee ram = new Employee("Ram", 20, 30000, "ABC123", "Kolkata");
            Employee ram1 = new Employee("Ram", 20, 40000, "XYZ456", "Delhi"); // Same name and age
            Employee raj = new Employee("Raj", 25, 30000, "AXD123", "Kolkata");
            Employee raj2 = new Employee("Rahul", 28, 50000, "XYZ789", "Mumbai"); // Same name and age

            // TreeSet that uses EmployeeTreeSet for comparison
            TreeSet<EmployeeTreeSet> setOfEmployees = new TreeSet<>();

            setOfEmployees.add(new EmployeeTreeSet(ram));
            setOfEmployees.add(new EmployeeTreeSet(ram1)); // This will be rejected
            setOfEmployees.add(new EmployeeTreeSet(raj));
            setOfEmployees.add(new EmployeeTreeSet(raj2));

            System.out.println("Contents of TreeSet:");
            for (EmployeeTreeSet wrapper : setOfEmployees) {
                System.out.println(wrapper);
            }
        }
    }


