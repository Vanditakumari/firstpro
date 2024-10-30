package employee_details_treeSet;

public class EmployeeTreeSet implements Comparable<EmployeeTreeSet> { //Comparable.java
        private Employee employee;

        public EmployeeTreeSet(Employee employee) {
            this.employee = employee;
        }

        public Employee getEmployee() {
            return employee;
        }

        @Override
        public int compareTo(EmployeeTreeSet other) {
            // Compare by name first, then by age
            int nameComparison = this.employee.getName().compareTo(other.employee.getName());
            if (nameComparison != 0) {
                return nameComparison;
            }
            return Integer.compare(this.employee.getAge(), other.employee.getAge());
        }

        @Override
        public String toString() {
            return employee.toString();
        }
    }


