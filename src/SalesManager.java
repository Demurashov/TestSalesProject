public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int shortMiddle(){
        int mid=0;
        int summ=0;
        for (int sale:sales) {
            summ+=sale;
        }
        mid=(summ-min()-max()/(sales.length-2));
        return mid;
    }
}