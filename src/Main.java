import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    private static int[] sales={10,5,3,1,18,4,6,0};
    public static void main(String[] args) {
        SalesManager manager = new SalesManager(sales);
        System.out.println("Максимальный доход от продаж: "+manager.max());
    }
}
