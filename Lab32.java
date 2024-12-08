package Lab_3;


import java.util.Scanner;

public class Lab32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення t: ");
        double t = scanner.nextDouble();

        for (int i = 1; i <= 5; i++) {
            double result = calculateEquation(t, i);
            System.out.println("i=" + i + ": " + result);
        }

        scanner.close();
    }

    public static double calculateEquation(double t, int i) {
        if (i < 1) {
            throw new IllegalArgumentException("i має бути більше або дорівнювати 1");
        }

        double result = 0.0;
        if (i == 1 || i == 2) {
            result = Math.log(t);
        } else if (i > 2) {
            for (int k = 1; k <= i; k++) {
                result += Math.sin(t) / k;
            }
        }

        return result;
    }
}
