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
    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public long shortMiddle(){
        long mid=0;
        long summ=0;
        for (long sale:sales) {
            summ+=sale;
        }
        mid=(summ-min()-max()/(sales.length-2));
        return mid;
    }
}