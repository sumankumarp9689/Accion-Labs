public class PatternSumCalculator {
    private int digit;

    public PatternSumCalculator(int digit) {
        if (digit < 0 || digit > 9) {
            throw new IllegalArgumentException("Input must be a single decimal digit between 0 and 9.");
        }
        this.digit = digit;
    }

    public int calculateSum() {
        int sum = 0;
        int currentNumber = 0;

        for (int i = 0; i < 4; i++) {
            currentNumber = currentNumber * 10 + digit;
            sum += currentNumber;
        }

        return sum;
    }

    public static void main(String[] args) {
        try {
            int input = 3;  // Example input
            PatternSumCalculator calculator = new PatternSumCalculator(input);
            int result = calculator.calculateSum();
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
