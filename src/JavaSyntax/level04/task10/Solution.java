package JavaSyntax.level04.task10;

/*
Охлаждение ядра планеты
*/

public class Solution {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        while (num <= 100) {
            if (num % 2 == 0) {
                sum += num;
                num++;
            }
            num++;
        }
        System.out.println(sum);
    }
}