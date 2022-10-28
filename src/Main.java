
public class Main {
    private static long[] sales = {10, 5, 3, 1, 18, 4, 6, 0};

    public static void main(String[] args) {
        SalesManager manager = new SalesManager(sales);
        System.out.println("Максимальный доход от продаж: " + manager.max());
        System.out.println("Минимальный доход от продаж:"+manager.min());
        System.out.println("Обрезанное среднее:"+manager.shortMiddle());
    }
}