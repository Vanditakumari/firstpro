package employee_details_treeset;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        EmployeeTree ram = new EmployeeTree("Ram", 20, 30000, "ABC123", "Kolkata");
        EmployeeTree ram1 = new EmployeeTree("Ram", 20, 30000, "ABC123", "Kolkata");
        EmployeeTree raj = new EmployeeTree("Raj", 25, 30000, "AXD123", "Kolkata");
        EmployeeTree raj2 = new EmployeeTree("Raj", 25, 30000, "AXD123", "Kolkata");

        // TreeSet that allows duplicates via the wrapper
        TreeSet<EmployeeWrapper> setOfEmployees = new TreeSet<>();

        setOfEmployees.add(new EmployeeWrapper(ram));
        setOfEmployees.add(new EmployeeWrapper(ram1));
        setOfEmployees.add(new EmployeeWrapper(raj));
        setOfEmployees.add(new EmployeeWrapper(raj2));


        System.out.println("Contents of TreeSet:");
        for (EmployeeWrapper wrapper : setOfEmployees) {
            System.out.println(wrapper);
        }
    }
}
