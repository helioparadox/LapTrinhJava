import java.util.Scanner;

public class GiaiHePhuongTrinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();
        scanner.close();
        giaiHePhuongTrinh(a1, b1, c1, a2, b2, c2);
    }
    public static void giaiHePhuongTrinh(double a1, double b1, double c1, double a2, double b2, double c2) {
        double D, Dx, Dy, x, y;
        
        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;
        
        if (D == 0) {
            if (Dx + Dy == 0) {
                System.out.println("He ptrinh co vo so nghiem.");
            } else {
                System.out.println("He ptrinh vo nghiem.");
            }
        } else {
            x = Dx / D;
            y = Dy / D;
            System.out.println("He ptrinh co mot nghiem duy nhat:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
