public class calculator {
    public static void main(String[] args) {
        // условие
        double a = 3.4;
        double b = 1.1;
        double c = 9;

        // x
        double x = a * Math.exp(-b * c) * Math.cos(b);

        // y
        double y = 0.315 * Math.sqrt((a * Math.pow(c, 3)) / b);

        // ответ
        System.out.printf("Значення x: %.4f%n", x);
        System.out.printf("Значення y: %.4f%n", y);
    }
}
