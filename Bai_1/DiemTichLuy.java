import java.util.ArrayList;
import java.util.Scanner;

class MonHoc {
    int soTinChi;
    double diemSo;

    public MonHoc(int soTinChi, double diemSo) {
        this.soTinChi = soTinChi;
        this.diemSo = diemSo;
    }
}

class HocKy {
    ArrayList<MonHoc> danhSachMonHoc = new ArrayList<>();

    public void themMonHoc(MonHoc monHoc) {
        danhSachMonHoc.add(monHoc);
    }

    public double tinhDiemTrungBinh() {
        double tongDiem = 0;
        int tongTinChi = 0;
        for (MonHoc monHoc : danhSachMonHoc) {
            tongDiem += monHoc.diemSo * monHoc.soTinChi;
            tongTinChi += monHoc.soTinChi;
        }
        return tongDiem / tongTinChi;
    }
}

public class SinhVien {
    ArrayList<HocKy> danhSachHocKy = new ArrayList<>();

    public void themHocKy(HocKy hocKy) {
        danhSachHocKy.add(hocKy);
    }

    public double tinhDiemTichLuy() {
        double tongDiem = 0;
        int tongTinChi = 0;
        for (HocKy hocKy : danhSachHocKy) {
            for (MonHoc monHoc : hocKy.danhSachMonHoc) {
                tongDiem += monHoc.diemSo * monHoc.soTinChi;
                tongTinChi += monHoc.soTinChi;
            }
        }
        return tongDiem / tongTinChi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien();

        System.out.println("Nhap so hoc ky:");
        int soHocKy = scanner.nextInt();

        for (int i = 0; i < soHocKy; i++) {
            HocKy hocKy = new HocKy();
            System.out.println("Hoc ky " + (i + 1) + ":");
            System.out.println("Nhap so mon hoc:");
            int soMonHoc = scanner.nextInt();

            for (int j = 0; j < soMonHoc; j++) {
                System.out.println("Mon hoc " + (j + 1) + ":");
                System.out.println("So tin chi:");
                int soTinChi = scanner.nextInt();
                System.out.println("Diem so:");
                double diemSo = scanner.nextDouble();

                MonHoc monHoc = new MonHoc(soTinChi, diemSo);
                hocKy.themMonHoc(monHoc);
            }
            sinhVien.themHocKy(hocKy);
        }

        System.out.println("Diem tich luy cua sinh vien: " + sinhVien.tinhDiemTichLuy());
    }
}
