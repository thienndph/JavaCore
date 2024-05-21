package JavaEncapsulation;

    public class Employee {
        // Private instance variables
        private int employee_id;
        private String employee_name;
        private double employee_salary;

        // Constructor
        public Employee(int employee_id, String employee_name, double employee_salary) {
            this.employee_id = employee_id;
            this.employee_name = employee_name;
            this.employee_salary = employee_salary;
        }

        // Getter for employee_id
        public int getEmployeeId() {
            return employee_id;
        }

        // Setter for employee_id
        public void setEmployeeId(int employee_id) {
            this.employee_id = employee_id;
        }

        // Getter for employee_name
        public String getEmployeeName() {
            return employee_name;
        }

        // Setter for employee_name
        public void setEmployeeName(String employee_name) {
            this.employee_name = employee_name;
        }

        // Getter for employee_salary
        public String getEmployeeSalary() {
            return String.format("$%.2f", employee_salary);
        }
    }


