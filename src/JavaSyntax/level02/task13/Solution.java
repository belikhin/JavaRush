package JavaSyntax.level02.task13;

/*
Конкатенация строк и чисел
*/

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;
        String digits = x + y + "" + z;
        System.out.println(digits);
    }
}