package JavaSyntax.level02.task15;

/*
Получение длины строки
*/

public class Solution {
    public static void main(String[] args) {
        String emptyString = "";
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}