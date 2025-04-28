public class EvenFibonacciSumCalculator {
    private int count;
    
    public EvenFibonacciSumCalculator(int count) {
        this.count = count;
    }

    public long calculateSum() {
        long sum = 0;
        int evenCount = 0;

        long a = 0;
        long b = 1;

        while (evenCount < count) {
            long next = a + b;
            a = b;
            b = next;

            if (next % 2 == 0) {
                sum += next;
                evenCount++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        EvenFibonacciSumCalculator calculator = new EvenFibonacciSumCalculator(100);
        long result = calculator.calculateSum();
        System.out.println("Sum of the first 100 even-valued Fibonacci numbers: " + result);
    }
}



