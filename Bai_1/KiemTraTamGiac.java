import java.util.Scanner;

public class KiemTraTamGiac {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba so " + a + ", " + b + " va " + c + " tao thanh tam giac.");
        } else {
            System.out.println("Ba so " + a + ", " + b + " va " + c + " khong tao thanh tam giac.");
        }
    }
}
