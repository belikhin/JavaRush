package JavaSyntax.level03.task09;

import java.util.Scanner;

/*
Био-мясо
*/

public class Solution {
    public static String NOT_YET = "Искусственное мясо еще не готово.";
    public static String DONE = "Искусственное мясо готово.";
    public static String HORRIBLY_DONE = "Искусственное мясо превратилось в мясного монстра!";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = scan.nextInt();
        int minutes = scan.nextInt();

        if (hours == 0 && minutes == 30) {
            System.out.println(DONE);
        }
        else if (hours == 0 && minutes < 30) {
            System.out.println(NOT_YET);
        }
        else {
            System.out.println(HORRIBLY_DONE);
        }
    }
}