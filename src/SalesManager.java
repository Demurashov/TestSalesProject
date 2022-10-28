public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
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