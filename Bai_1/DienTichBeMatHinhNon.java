import java.util.Scanner;

public class TinhDienTichHinhNon {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Nhap ban kinh r
        double r = scanner.nextDouble();
        
        //Nhap duong sinh l
        double l = scanner.nextDouble();
        
        scanner.close();
        
        double dienTich = tinhDienTichHinhNon(r, l);
        System.out.println("Dien tich be mat hinh non la: " + dienTich);
    }
    
    public static double tinhDienTichHinhNon(double r, double l) {
        double pi = Math.PI;
        return pi * r * (r + l);
    }
}
