package JavaSyntax.level03.task08;

import java.util.Scanner;

/*
Три числа
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        }

        if (num1 == num2 && num1 != num3) {
            System.out.println(num1 + " " + num2);
        }

        if (num1 == num3 && num1 != num2) {
            System.out.println(num1 + " " + num3);
        }

        if (num2 == num3 && num2 != num1) {
            System.out.println(num2 + " " + num3);
        }
    }
}