package JavaSyntax.level03.task14;

import java.util.Scanner;

/*
Ищем максимум
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        int result = numberA > numberB ? numberA : numberB;
        System.out.println(result);
    }
}