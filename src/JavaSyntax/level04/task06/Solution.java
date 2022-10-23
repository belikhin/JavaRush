package JavaSyntax.level04.task06;

/*
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {

        int count = 0;
        while(count < 3) {

            // Первая строка
            if (count == 0) {
                int string1 = 0;
                while (string1 < 20) {
                    System.out.print("Б");
                    string1++;
                }
                System.out.println();
            }

            // Середина с пробелами
            if (count == 1) {

                int middle = 0;
                while (middle < 8) {
                    System.out.print("Б");
                    int m = 0;
                    while (m < 18) {
                        System.out.print(" ");
                        m++;
                    }
                    System.out.print("Б");
                    System.out.println();
                    middle++;
                }
            }

            // Последняя строка
            if (count == 2) {
                int string10 = 0;
                while (string10 < 20) {
                    System.out.print("Б");
                    string10++;
                }
            }
            count++;
        }
    }
}