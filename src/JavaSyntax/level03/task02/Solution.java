package JavaSyntax.level03.task02;

import java.util.Scanner;

/*
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";

        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();
        if (temperature < 0) {
            System.out.println(cold);
        }
        else {
            System.out.println(warm);
        }
    }
}