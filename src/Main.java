public class Main {
    public static void main(String[] args) {
        String[] products = {"Хлеб", "Яблоки", "Молоко", "Гречка"};
        int[] prices = {100, 200, 300, 400};
        int[] counters = new int[products.length];

        showMenu(products, prices);
//        dialogCustomer(counters);
//        calcResults(products, prices, counters);
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