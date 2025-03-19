import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};

        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s %d руб/шт\n", i + 1, products[i], prices[i]);
        }

        int[] basket = new int[products.length];
        int sumProducts = 0;

        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine(); // "1 10"
            if ("end".equals(input)) {
                break;
            }

            String[] parts = input.split(" "); // ["1", "10"]
            int product = Integer.parseInt(parts[0]) - 1;
            int countOfProducts = Integer.parseInt(parts[1]);

            basket[product] += countOfProducts;
            sumProducts += prices[product] * countOfProducts;
        }

        System.out.println("Ваша корзина:");
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == 0) {
                continue;
            }
            System.out.printf("%s %d шт %d руб/шт %d руб в сумме\n",
                    products[i], basket[i], prices[i], basket[i] * prices[i]);
        }

        System.out.println("Итого " + sumProducts + " руб");
    }
}