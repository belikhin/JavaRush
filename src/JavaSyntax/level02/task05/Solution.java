package JavaSyntax.level02.task05;

/*
Последняя цифра числа
*/

public class Solution {
    public static void main(String[] args) {
        int number = 546;
        int lastDigit = number % 10;
        System.out.println(lastDigit);
    }
}