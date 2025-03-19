import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] products = {"Хлеб", "Яблоки", "Молоко", "Гречка"};
        int[] prices = {100, 200, 300, 400};
        int[] counters = new int[products.length];

        showMenu(products, prices);
        dialogCustomer(counters);
        calcResults(products, prices, counters);
    }

    private static void calcResults(String[] products, int[] prices, int[] counters) {
        System.out.println("\nВаша корзина:");
        int totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (counters[i] > 0) {
                int currentPrice = prices[i] * counters[i];
                totalPrice += currentPrice;
                System.out.printf("%s %d шт %d руб/шт %d руб в сумме\n",
                        products[i],
                        counters[i],
                        prices[i],
                        currentPrice
                );
            }
        }
        System.out.printf("Итого %d руб\n", totalPrice);
    }

    private static void dialogCustomer(int[] counters) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String answer = sc.nextLine();
            if ("end".equals(answer)) {
                break;
            }

            String[] splittedAnswer = answer.split(" ");
            int productPosition = Integer.parseInt(splittedAnswer[0]) - 1;
            int productCount = Integer.parseInt(splittedAnswer[1]);

            counters[productPosition] += productCount;
        }
    }

    private static void showMenu(String[] products, int[] prices) {
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s %d руб/шт\n",
                    i + 1,
                    products[i],
                    prices[i]
            );

        }
    }
}