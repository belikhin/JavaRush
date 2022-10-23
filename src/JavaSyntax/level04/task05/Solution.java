package JavaSyntax.level04.task05;

/*
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int width = 0;
        while (width < 5) {
            int length = 0;
            while (length < 10) {
                System.out.print("Q");
                length++;
            }
            System.out.println();
            width++;
        }
    }
}