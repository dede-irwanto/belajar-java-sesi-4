package classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Dede Irwanto";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Dede"));
        System.out.println(name.endsWith("Irwanto"));

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(name.charAt(0));
    }
}
