import java.text.NumberFormat;

public class AverageCalculation {

    private static String formCount(Long count) {
        if (count != null) {
            NumberFormat myFormat = NumberFormat.getInstance();
            myFormat.setGroupingUsed(true);
            return myFormat.format(count);
        } else {
            return "N/A";
        }
    }

    static Integer a = 12345678;
    static Integer b = 200;

    public static void main(String[] args) {
        // This will overflow if stored in Integer
        Integer multiplication = a * b;

        // But compute average safely by casting before multiplication
        //long average = ((long) a * b) / 2;

        String averageValue = formCount(((long) a * b) / 2);

        System.out.println("Multiplication (overflowed): " + multiplication);
        System.out.println("***** Average value (safe): " + averageValue);
    }
}
