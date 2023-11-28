package inheritance1;

public class SalaryEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalaryEmployee(String name, String birthDate, String endDate, long employeeID, String hireDate,
                          double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeID, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        System.out.println(super.getName() + " retire status is " + (isRetired ? "Retired" : "Working"));
    }

    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    @Override
    public void collectPay(double payAmount) {
        super.collectPay(payAmount);
        System.out.println("Paid by Salary");
    }
}
