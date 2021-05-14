import javax.script.ScriptContext;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng giai thừa cần tính:");
        int m = scanner.nextInt();
        System.out.printf("Giai thừa của " + m + " theo vòng lặp for là:%d\n", baiTapBuoi4.tinhGtFor(m));
        System.out.printf("Giai thừa của " + m + " theo vòng lặp while là: %d\n", baiTapBuoi4.tinhGtFor(m));
        System.out.printf("Giai thừa của " + m + " theo vòng lặp do là: %d\n", baiTapBuoi4.tinhGtWhile(m));

        System.out.print("Liệt kê các số nguyên tố nhỏ hơn 100 theo vòng lặp for: ");
        System.out.print(baiTapBuoi4.ChuoiSnt1(100));

        System.out.print("Nhập số lượng số nguyên tố cần liệt kê:");
        int k = scanner.nextInt();
        System.out.print(baiTapBuoi4.ChuoiSnt2(k));



    }
}