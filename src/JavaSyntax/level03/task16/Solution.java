package JavaSyntax.level03.task16;

import java.util.Scanner;

/*
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if (Math.abs(num2 - num1) < 0.000001) {
            System.out.println("числа равны");
        }
        else {
            System.out.println("числа не равны");
        }
    }
}