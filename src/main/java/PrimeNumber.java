public class PrimeNumber {
    private int number;

    public PrimeNumber(int number) {
        this.number = number;
    }

    public void calculate() {
        int k = number;
        boolean prime = true;
        if (k <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(k); i++) {
                if (k % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println(k + " " + "простое число");
        } else {
            System.out.println(k + " " + "не является простым числом");
        }
    }
}
