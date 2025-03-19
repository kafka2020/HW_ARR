public class Main {
    public static void main(String[] args) {
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int[] counters = new int[products.length];

        showMenu();
        dialogCustomer();
        calcResults();
    }
}