package JavaSyntax.level03.task18;

import java.util.Scanner;

/*
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        String string2 = scan.nextLine();

        if (string1.equals(string2)) {
            System.out.println("строки одинаковые");
        }
        else {
            System.out.println("строки разные");
        }
    }
}