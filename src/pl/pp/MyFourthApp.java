import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter lower and upper integer limits:");
            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Done");
                break;
            }

            int sum = 0;
            for (int i = lowerLimit; i <= upperLimit; i++) {
                sum += i * i;
            }
            System.out.println("The sums of the squares from " + lowerLimit * lowerLimit + " to " + upperLimit * upperLimit + " is " + sum);
        }
        scanner.close();
    }
}
