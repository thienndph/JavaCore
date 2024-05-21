package JavaInheritance;

// Lớp JavaInheritance.Person
class Person {
    protected String firstName;
    protected String lastName;

    // Constructor để khởi tạo tên và họ
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Phương thức getFirstName để lấy tên
    public String getFirstName() {
        return firstName;
    }

    // Phương thức getLastName để lấy họ
    public String getLastName() {
        return lastName;
    }
}

// Lớp JavaInheritance.Employee kế thừa từ JavaInheritance.Person
class Employe extends Person {
    private String employeeId;
    private String jobTitle;

    // Constructor để khởi tạo tên, họ, mã nhân viên và chức danh công việc
    public Employe(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    // Phương thức mới getEmployeeId để lấy mã nhân viên
    public String getEmployeeId() {
        return employeeId;
    }

    // Ghi đè phương thức getLastName để bao gồm chức danh công việc
    @Override
    public String getLastName() {
        return lastName + ", " + jobTitle;
    }
}