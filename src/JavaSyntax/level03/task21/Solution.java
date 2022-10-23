package JavaSyntax.level03.task21;

import java.util.Scanner;

/*
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String code = scan.nextLine();
        if (code.equalsIgnoreCase(secret)) {
            System.out.println("доступ разрешен");
        }
        else {
            System.out.println("доступ запрещен");
        }
    }
}