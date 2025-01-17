public class StringExample6 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "HELLO";
        boolean result = str1.equalsIgnoreCase(str2);
        System.out.println("Strings are equal ignoring case: " + result);
    }
}
