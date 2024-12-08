package Lab_3;

public class Lab33 {
    public static void main(String[] args) {
        double epsilon = 1e-6; // Задана точність
        double sum = 0.0;
        int i = 1;
        double term = 1.0 / (i * (i + 1));

        while (Math.abs(term) >= epsilon) {
            sum += term;
            i++;
            term = 1.0 / (i * (i + 1));
        }

        System.out.println("Сума з точністю ε = " + epsilon + " дорівнює " + sum);
    }
}

