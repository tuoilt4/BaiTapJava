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

    //Check số nguyên tố
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

    // ham in ra so nguyen to theo vòng lặp for
    static void ChuoiSnt1 (int n)
    {
        for(int i = 1 ;i<n;i++)
        {
            if(checkSnt(i))
            {
                 System.out.printf("\t %d",i);
            }
        }
    }

    // ham in ra so nguyen to theo vòng lặp while
    static void ChuoiSnt2 (int n){
        int i=3;
        while (i<n)
        {
            if (baiTapBuoi4.checkSnt(i))
            {
                System.out.print(i+"\t");
            }
            i++;
        }
    }
    // ham in ra so nguyen to theo vòng lặp do
    static void ChuoiSnt3 (int n)
    {
    int i =3;
        do{
    if (baiTapBuoi4.checkSnt(i))
    {
        System.out.print(i +"\t");
    }
    i++;}
        while (i<n);
    }

    //ham in ra n số nguyên tố đầu tiên theo vòng lặp for
    static void ChuoiSnt4 (int n) {
        int dem = 0;
        for (int i = 2; dem < n; i++)
        {
            if (checkSnt(i))
            {
                System.out.print("\t" + i);
                dem++;
            };
        }
    }
    //hàm in ra n số nguyên tố đầu tiên theo vòng lặp while
    static void ChuoiSnt5 (int n) {
        int i = 2;
        int dem =0;
        while(dem < n)
        {
            if (baiTapBuoi4.checkSnt(i))
            {
                System.out.print(i+"\t");
                dem ++;
            }
            i++;
        }
    }
    static void ChuoiSnt6 (int n){
    int i = 2;
    int dem =0;
    do {
        if (baiTapBuoi4.checkSnt(i))
        {
            System.out.print( i+ "\t");
            dem ++;
        }
        i++;
    }
    while(dem <n); }


}