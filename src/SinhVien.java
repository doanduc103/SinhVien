import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
    Scanner scanner = new Scanner(System.in);
    public int stt;
    public String HoTen;
    public String DiaChi;
    public float diemHK;
    public List<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVien(int stt, String hoTen, String diaChi, float diemHK) {
        this.stt = stt;
        HoTen = hoTen;
        DiaChi = diaChi;
        this.diemHK = diemHK;
    }

    public SinhVien() {

    }

    public float getDiemHK() {
        return diemHK;
    }

    public void setDiemHK(float diemHK) {
        this.diemHK = diemHK;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void addSinhVien() {

        SinhVien sv = new SinhVien();
        System.out.println("Nhập STT sinh viên : ");
        sv.setStt(scanner.nextInt());
        System.out.println("Nhập họ tên sinh viên :");
        sv.setHoTen(scanner.nextLine());
        System.out.println("Nhập địa chỉ :");
        sv.setDiaChi(scanner.nextLine());
        System.out.println("nhập điểm HK : ");
        sv.setDiemHK(scanner.nextFloat());
        listSinhVien.add(sv);
        try {
            FileWriter fw = new FileWriter("D:\\data.txt");
            fw.write("Số thứ tự :" + sv.getStt() + "\n" + "Họ tên : " + sv.getHoTen() +
                    "\n" + "Địa chỉ : " + sv.getDiaChi() + " \n" + "Điểm học kì : " + sv.getDiemHK());

            fw.close();
        } catch (Exception e) {

        }
    }

    public void hienTT() {
        for (SinhVien sv : listSinhVien) {
            System.out.println("STT :" + sv.getStt());
            System.out.println("Họ và tên :" + sv.getHoTen());
            System.out.println("Địa chỉ :" + sv.getDiaChi());
            System.out.println("Điểm học kì :" + sv.getDiemHK());
            System.out.println("===============================");
        }
    }

    public void print() {

    }
}
