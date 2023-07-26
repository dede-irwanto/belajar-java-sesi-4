package classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        String contoh = "10000";

        Integer contohInt = Integer.valueOf(contoh); // conversi string to integer
        System.out.println(contohInt);
    }
}
