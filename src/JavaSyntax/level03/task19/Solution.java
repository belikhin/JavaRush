package JavaSyntax.level03.task19;

public class Solution {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";

        String compare1 = string1 == string2 ? same : different;
        String compare2 = string1 == string3 ? same : different;
        String compare3 = string2 == string3 ? same : different;

        System.out.println(compare1);
        System.out.println(compare2);
        System.out.println(compare3);
    }
}