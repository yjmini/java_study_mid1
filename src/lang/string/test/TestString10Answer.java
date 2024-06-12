package lang.string.test;

public class TestString10Answer {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] split = fruits.split(",");
        for (String string : split) {
            System.out.println(string);
        }

        String joinedString = String.join("->", split);
        System.out.println("joinedString = " + joinedString);
    }
}
