public class MethodOverloading2 {
    public static void main(String[] args) {
        System.out.println("My time: " + getDurationString(80,55));
        System.out.println("My time: " + getDurationString(-80,55));
        System.out.println("My time: " + getDurationString(80,60));

        System.out.println("- - - - - - - - - - -");

        System.out.println("My time: " + getDurationString(4855));
        System.out.println("My time: " + getDurationString(0));
        System.out.println("My time: " + getDurationString(-77));
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return "Invalid minutes or seconds.";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours +  "h" + " " + remainingMinutes + "m" + " " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid seconds.";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
