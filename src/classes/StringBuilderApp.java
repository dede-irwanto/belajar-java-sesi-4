package classes;

/**
 * Bila pada progam ada banyak manipulasi string, alangkah baiknya menggunakan StringBuilder agar menghemat memory
 */
public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Dede");
        builder.append(" ");
        builder.append("Irwanto");

        System.out.println(builder);
    }
}
