package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";

        boolean b = url.startsWith("https://");
        System.out.println("b = " + b);
    }
}
