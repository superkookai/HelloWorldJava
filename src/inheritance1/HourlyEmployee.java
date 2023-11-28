package inheritance1;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeID, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, employeeID, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void getDoublePay(){
        System.out.println(super.getName() + " got double paid.");
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }

    @Override
    public void collectPay(double payAmount) {
        super.collectPay(payAmount);
        System.out.println("Paid by Hourly");
    }
}
