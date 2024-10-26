package employee_details_treeset;

class EmployeeWrapper implements Comparable<EmployeeWrapper> {
    private EmployeeTree employee;

    public EmployeeWrapper(EmployeeTree employee) {
        this.employee = employee;
    }

    @Override
    public int compareTo(EmployeeWrapper other) {
        // Compare based on properties; always return 0 to treat as equal
        return 0;
    }

    public EmployeeTree getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}

