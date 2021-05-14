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

        System.out.println("Liệt kê các số nguyên tố nhỏ hơn 100 theo vòng lặp for:");
        baiTapBuoi4.ChuoiSnt1(100);

        System.out.println("\nLiệt kê các số nguyên tố nhỏ hơn 100 theo vòng lặp while:");
        baiTapBuoi4.ChuoiSnt2(100);

        System.out.println("\nLiệt kê các số nguyên tố nhỏ hơn 100 theo vòng lặp do:");
        baiTapBuoi4.ChuoiSnt3(100);

        System.out.print("\nNhập số lương số nguyên tố cần liệt kê: ");
        int h = scanner.nextInt();

        System.out.print("Liệt kê theo vòng lặp for: ");
        baiTapBuoi4.ChuoiSnt4(h);

        System.out.print("\nLiệt kê theo vòng lặp while: ");
        baiTapBuoi4.ChuoiSnt5(h);

        System.out.print("\nLiệt kê theo vòng lặp do: ");
        baiTapBuoi4.ChuoiSnt6(h);

    }
}