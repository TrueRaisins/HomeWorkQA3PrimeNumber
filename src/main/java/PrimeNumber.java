public class PrimeNumber {
    private int number;

    public PrimeNumber(int number) {
        this.number = number;
    }

    public void calculate() {
        int number = 1;
        boolean prime = true;
        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println(number + " " + "простое число");
        } else {
            System.out.println(number + " " + "не является простым числом");
        }
    }
}
