package JavaSyntax.level02.task21;

import java.util.Scanner;

/*
Чтение чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        System.out.print((a + b + c) / 3);
    }
}