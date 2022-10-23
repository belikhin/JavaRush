package JavaSyntax.level03.task10;

import java.util.Scanner;

/*
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sideA = scan.nextInt();
        int sideB = scan.nextInt();
        int sideC = scan.nextInt();

        int sumOfSidesAB = sideA + sideB;
        int sumOfSidesAC = sideA + sideC;
        int sumOfSidesBC = sideB + sideC;

        if ((sideA < sumOfSidesBC && sideB < sumOfSidesAC) && (sideC < sumOfSidesAB)){
            System.out.println(TRIANGLE_EXISTS);
        }
        else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}