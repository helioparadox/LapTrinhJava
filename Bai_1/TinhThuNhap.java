import java.util.Scanner;

public class TinhThuNhap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soNgayLamViec = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nhap chuc vu: ");
        String chucVu = scanner.nextLine();
        scanner.close();
        
        double thuNhap = tinhThuNhap(soNgayLamViec, chucVu);
        System.out.println("Thu nhap cua ban la: " + thuNhap + " VND");
    }
    
    public static double tinhThuNhap(int soNgayLamViec, String chucVu) {
        final double LCB = 1490000;
        double heSoChucVu = 1.0;
        
        switch (chucVu) {
            case "Truong_phong":
                heSoChucVu += 0.3;
                break;
            case "Giam_doc":
                heSoChucVu += 0.5;
                break;
        }
        
        double thuNhap = LCB * heSoChucVu;
        
        if (soNgayLamViec > 22 && soNgayLamViec <= 25) {
            thuNhap *= 1.2; 
        } else if (soNgayLamViec > 25) {
            thuNhap *= 2; 
        }
        
        return thuNhap;
    }
}
