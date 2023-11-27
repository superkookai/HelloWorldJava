package recordexample;

public class Main {
    public static void main(String[] args) {
        Student pojoStudent = new Student("S12345","Bill","iOS dev");
        LPAStudent recordStudent = new LPAStudent("L11123","Sammanta","Java Master Class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent); //Built-in toString

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList()); //Built-in getter

        //Record cannot has any setters. If you need to modify fields, use Class. Record normally use to get data from database
    }
}
