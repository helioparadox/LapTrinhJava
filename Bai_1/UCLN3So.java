import java.util.Scanner;

public class UocChungLonNhat3So {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int ucln1 = gcd(a, b);
        int ucln2 = gcd(ucln1, c);
        
        System.out.println("UCLN cua " + a + ", " + b + " va " + c + " la: " + ucln2);
    }
}
