package NhanVien;
import java.util.ArrayList;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> listNv = new ArrayList<>();
        int n;
        do {
            NhanVien nv = new NhanVien();
            System.out.println("Nhập tên nhân viên:");
            do {
                nv.setTen(scanner.nextLine());
                if (nv.getTen().matches("[a-z A-Z]+")) {
                    break;
                } else {
                    System.out.println("Hãy nhập lại tên!");
                }
            } while (true);

            System.out.println("nhập tuổi:");
            do {
                try {
                    nv.setTuoi(Integer.parseInt(scanner.nextLine()));
                    break;
                } catch(Exception e) {
                    System.out.println("Hãy nhập lại!");
                }
            } while (true);

            System.out.println("nhập địa chỉ:");
            nv.setDc(scanner.nextLine());
            System.out.println("nhập số điện thoại:");
            do {
                nv.setSdt(scanner.nextLine());
                if (nv.getSdt().matches("[0-9]+") && (nv.getSdt().length() == 10) && (nv.getSdt().startsWith("0")))  {
                    break;
                } else {
                    System.out.println("Hãy nhập lại!");
                }
            } while (true);

            System.out.println("nhập giới tính:");
            nv.setGt(scanner.nextLine());
            listNv.add(nv);
            System.out.println("nhập 1 để tiếp tục 0 để kết thúc");
            n = Integer.parseInt(scanner.nextLine());
        }
        while (n == 1);
        for (NhanVien nv : listNv)
        {
            System.out.print("- Tên " + nv.getTen() + " Tuổi: " + nv.getTuoi() + " Giới tính: " + nv.getGt() + " Địa chỉ: " + nv.getDc() + " Tuổi: " + nv.getSdt() + "\n");
        }
    }
}
