package app_java_important;

public class StringCaseSwapper {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String swapped = swapCase(str);
        System.out.println("Original String: " + str);
        System.out.println("Swapped String: " + swapped);
    }

    public static String swapCase(String str) {
        StringBuilder swapped = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                swapped.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swapped.append(Character.toUpperCase(c));
            } else {
                swapped.append(c);
            }
        }
        return swapped.toString();
    }
}
