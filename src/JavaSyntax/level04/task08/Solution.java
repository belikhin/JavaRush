package JavaSyntax.level04.task08;

import java.util.Scanner;

/*
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            String word = scan.nextLine();
            if (word.equals("enough")) {
                break;
            }
            else {
                System.out.println(word);
            }
        }
    }
}