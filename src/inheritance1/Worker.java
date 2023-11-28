package inheritance1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Worker {
    private String name;
    private String birthDate; // format like yyyy-MM-dd
    private String endDate; // format like yyyy-MM-dd

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        Date today = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String todayStrDate = dateFormat.format(today);

        LocalDate date1 = LocalDate.parse(this.birthDate);
        LocalDate date2 = LocalDate.parse(todayStrDate);
        Period period = date1.until(date2);
        int age = period.getYears();
        return age;
    }
    public void collectPay(double payAmount){
        System.out.println("Paid: " + payAmount + " to " + this.name);
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println(this.name + " terminate on " + this.endDate);
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
