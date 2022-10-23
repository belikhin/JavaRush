package JavaSyntax.level04.task01;

import java.util.Scanner;

/*
Защита от землетрясения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        if (number > 0) {
            while (number != -1) {
                sum += number;
                number--;
            }
            System.out.println(sum);
        }
        else {
            System.out.println(0);
        }
    }
}