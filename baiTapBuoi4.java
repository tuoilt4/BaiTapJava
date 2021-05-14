public class baiTapBuoi4
{
    //Tính giai thừa (n!) với n nhập từ bàn phím
    //theo vòng lặp for
    public static long tinhGtFor(int n)
    {
        long giaithua = 1;
        if (n == 0 || n == 1)
        {
            return giaithua;
        } else
        {
            for (int i = 2; i <= n; i++)
            {
                giaithua = giaithua * i;
            }
            return giaithua;
        }
    }

    //theo vòng lặp while
    public static long tinhGtWhile(int n)
    {
        long giaithua = 1;
        if (n == 0 || n == 1)
        {
            return giaithua;
        }
        else
            {
                int i=2;
                while (i<=n)
                {
                  giaithua   =giaithua*i;
                  i++;
                }
                return giaithua;
            }

    }
    //theo vòng lặp do while
    public static long tinhGtDo(int n)
    {
        long giaithua = 1;
        if (n == 0 || n == 1) {
            return giaithua;
        } else {
            int i = 2;
            do {
                giaithua = giaithua * i;
                i++;
            }
            while (i < n);
            return giaithua;
        }
    }

    //Tính dãy số fibonaci
    //Theo vòng lặp for
    public static boolean checkSnt(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    // ham in ra so nguyen to theo vòng lặp
    void  ChuoiSnt1 (int n)
    {
        for(int i = 1 ;i<n;i++)
        {
            if(checkSnt(i))
            {
                System.out.print("\t" +i);
            }
        }
    }
    void ChuoiSnt2 (int n)
    {
        int dem = 0;
        for (int i=2; dem<n; i++)
        {
            if (checkSnt(i))
            {
                System.out.print("\t" + i);
                dem++;
            }
            i++;
        }
    }
}