package JavaSyntax.level03.task11;

import java.util.Scanner;

/*
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if (age < 20 || age > 60)
            System.out.println("можно не работать");
    }
}