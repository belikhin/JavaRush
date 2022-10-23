package JavaSyntax.level04.task03;

import java.util.Scanner;

/*
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int count = 0;
        while (count < 10) {
            System.out.println(name + text);
            count++;
        }
    }
}