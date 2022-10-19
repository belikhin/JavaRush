package JavaSyntax.level02.task08;

/*
Генератор позитивных новостей
*/

public class Solution {
    public static void main(String[] args) {
        String name = "Амиго",
                date = "2 октября",
                time = "в 4 часа дня",
                noun = "позитивных новостей",
                adjective = "генератор",
                verb = "выдаёт";
        System.out.println("Новости:");
        System.out.println(name + " " + date + " " + time + " изобрел " + adjective + " " + noun + " который " + verb + " террабайты данных в минуту.");
    }
}