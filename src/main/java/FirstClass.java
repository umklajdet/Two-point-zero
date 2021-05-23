/**
 * @author P
 * @see #someMethod(int)
 */
public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Welcome to Java 2.0");
        for (String str : args) {
            System.out.printf("%s%n", str);
        }
        String[] strArr = new String[] {"Hi", "Hello", "Good morning"};
    }

    /**
     *
     * @param x some int
     * @return some string
     */
    public String someMethod(int x){
        return "2.0";
    }
}
