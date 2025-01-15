package Day_05;

import java.util.Scanner;

public class WaterBottles {
    public static void main(String[] args) {

        String str = """
                There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.
                The operation of drinking a full water bottle turns it into an empty bottle.
                Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
                """;

        String example = """
                Example 1:
                Input: numBottles = 9, numExchange = 3
                Output: 13
                Explanation: You can exchange 3 empty bottles to get 1 full bottle.
                Number of water bottles you can drink: 9 + 3 + 1 = 13.
                """;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("cuantas botellas de agua tienes?");
            int numBottles = scanner.nextInt();
            System.out.println("cuantas botellas vacias necesitas para cambiar por una llena?");
            int numExchange = scanner.nextInt();
            System.out.println("El numero maximo de botellas de agua que puedes beber es: " + numWaterBottles(numBottles, numExchange));
        } catch (Exception e) {
            System.out.println("Por favor ingresa un numero valido");
        }
    }


    public static int numWaterBottles(int numBottles, int numExchange) {
        int drinked = numBottles;
        int empty = numBottles;
        int newBottles = 0;
        while (empty >= numExchange) {
            newBottles = empty / numExchange;
            drinked += newBottles;
            empty = (empty % numExchange) + newBottles;
        }
        return drinked;
    }
}
