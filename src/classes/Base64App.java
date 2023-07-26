package classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Dede Irwanto";

        // encode string
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        // decode string
        byte[] decoded = Base64.getDecoder().decode(encoded);
        String result = new String(decoded);
        System.out.println(result);
    }
}
