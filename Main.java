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
        for (int i = 3; i < 100; i++) {
            if (baiTapBuoi4.checkSnt(i))
            {
                System.out.print(i+"\t");
            }
        }
        System.out.print("\nLiệt kê các số nguyên tố nhỏ hơn 100 theo vòng lặp while: ");
        int k1=3;
        while (k1<100)
        {
        if (baiTapBuoi4.checkSnt(k1))
            {
                System.out.print(k1+"\t");
            }
        k1++;
        }

        System.out.print("\nLiệt kê các số nguyên tố nhỏ hơn 100 theo vòng lặp do: ");
        int k2=3;
        do{
        if (baiTapBuoi4.checkSnt(k2))
        {
            System.out.print(k2 +"\t");
        }
        k2++;}
        while (k2<100);

        System.out.print("\nNhập số lương số nguyên tố đầu tiên cần liệt kê: ");
        int h = scanner.nextInt();
        System.out.print("Liệt kê theo vòng lặp for: ");
        int dem=0;
        for (int i = 2; dem < h; i++) {
            if (baiTapBuoi4.checkSnt(i))
            {
                System.out.print(i+"\t");
                dem ++;
            }
        }

        System.out.print("\nLiệt kê theo vòng lặp while: ");
        int q1 = 2;
        int dem1 =0;
        while(dem1 < h)
        {
            if (baiTapBuoi4.checkSnt(q1))
            {
                System.out.print(q1+"\t");
                dem1 ++;
            }
            q1++;
        }

        System.out.print("\nLiệt kê theo vòng lặp do: ");
        int q2 = 2;
        int dem2 =0;
        do {
            if (baiTapBuoi4.checkSnt(q2))
            {
                System.out.print( q2+ "\t");
                dem2 ++;
            }
            q2++;
        }
        while(dem2 < h);


    }
}