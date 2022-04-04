import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    Scanner scanner = new Scanner(System.in);
    SinhVien sv = new SinhVien();



    public static void showMenu() {
        System.out.println("------------Menu----------------");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Xuất thông tin sinh viên");
        System.out.println("3. Exit");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv = new SinhVien();
        int choose = 0;
        showMenu();
        while (true) {
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    sv.addSinhVien();
                    showMenu();
                    break;
                case 2:
                    sv.hienTT();
                    showMenu();
                    break;
                case 3:
                    System.exit(1);
                    showMenu();
            }
        }
    }
}
