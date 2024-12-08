package Lab3;


import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення t: ");
        double t = scanner.nextDouble();

        System.out.print("Введіть значення s: ");
        double s = scanner.nextDouble();

        for (int k = 3; k <= 25; k++) {
            double result = calculateFormula(t, s, k);
            System.out.println("k=" + k + ": " + result);
        }

        scanner.close();
    }

    public static double calculateFormula(double t, double s, int k) {
        if (k < 3 || k > 25) {
            throw new IllegalArgumentException("k має бути від 3 до 25");
        }

        double sum = 0.0;
        for (int i = 1; i <= k; i++) {
            if (i == 0 || t * i >= 0 || i * i == 0) {
                throw new IllegalArgumentException("Недійсне значення аргументу або параметру");
            }

            double lnTerm = Math.log(-t * i);
            double cosTerm = Math.cos(Math.sqrt(s / (i * i)));
            sum += lnTerm * cosTerm;
        }
        return 25 * sum;
    }
}

