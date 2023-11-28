package inheritance1;

public class Employee extends Worker {
    private long employeeID;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeID, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public String getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
