package Bài2;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;



public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        int i, choiceNumber;


        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = sc.nextLine();

        for (; ; ) {
            System.out.println("\n----------Danh sách chức năng----------");
            System.out.println("1. Đảo ngược chuỗi");
            System.out.println("2. Tách chuỗi theo Alphabet");
            System.out.println("3. In ra vị trí");
            System.out.println("4. Tách chuỗi theo vị trí");


            do {
                System.out.println("Bấm số để chọn chức năng: ");
                choiceNumber = sc.nextInt();
                //} while ((choiceNumber < 1) || (choiceNumber > 4));

                switch (choiceNumber) {
                    case 1:
                        // đảo ngược

                        String[] words = chuoi.split(" ");
                        System.out.print("Chuỗi đảo ngược là: ");
                        for (i = words.length - 1; i >= 0; i--) {
                            System.out.print(words[i] + " ");
                        }
                        break;

                    case 2:
                        //sắp xếp theo bang chữ cái
                        String[] words1 = chuoi.split(" ");
                        System.out.println("Chuỗi theo bản chữ cái: ");
                        Collator col = Collator.getInstance(new Locale("en", "EN"));
                        Arrays.sort(words1, col);
                        String sorted = "";
                        for (i = 0; i < words1.length; i++) {
                            sorted += words1[i] + " ";
                        }
                        System.out.print(sorted + " ");
                        break;

                    case 3:
                        // in ra vị trí
                        String[] words2 = chuoi.split(" ");
                        System.out.println("Nhập vị trí muốn in: ");
                        int n = sc.nextInt();
                        System.out.println("Ký tự tại vị trí thứ " + n + " là: " + words2[(n - 1)]);
                        break;

                    case 4:
                        //Tách chuỗi mới
                        String[] words3 = chuoi.split(" ");
                        System.out.println("Nhập vị trí muốn tách: ");
                        int tach = sc.nextInt();
                        for (i = 0; i <= (tach - 1); i++) {
                            System.out.print(words3[i] + " ");
                        }
                        break;
                    default:
                        System.out.println("Nhập từ 1-4 để chọn chức năng!");
                }
            } while ((choiceNumber < 1) || (choiceNumber > 4));
        }
    }
}