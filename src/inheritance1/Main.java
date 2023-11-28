package inheritance1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[4];
        workers[0] = new Worker("Kai","1974-04-16","2024-12-31");
        workers[1] = new Employee("Joe","1999-01-01","2024-12-31",12345,
                "2022-01-01");
        workers[2] = new SalaryEmployee("Samanta","2000-05-05","2026-04-30",54321,
                "2020-11-01",100000, false);
        workers[3] = new HourlyEmployee("Ticky","1988-03-15","2024-12-31",56789,
                "2021-01-01",100);
        for (Worker w : workers){
            System.out.println(w);
        }

        System.out.println("- - - - - - -");

        workers[3].collectPay(100);
        HourlyEmployee h1 = (HourlyEmployee) workers[3];
        h1.getDoublePay();

        System.out.println("- - - - - - -");

        workers[2].collectPay(1000);


    }
}
