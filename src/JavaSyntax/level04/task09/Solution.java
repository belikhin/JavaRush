package JavaSyntax.level04.task09;

/*
Сумма чисел, не кратных 3
*/

public class Solution {
    public static void main(String[] args) {
        int numbers = 1, sum = 0;
        while (numbers <= 100) {
            if (numbers % 3 == 0) {
                numbers++;
                continue;
            }
            sum += numbers;
            numbers++;
        }
        System.out.println(sum);
    }
}