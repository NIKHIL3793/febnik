package Loop;

import java.util.Scanner;

public class If {
    public static void main(String[] args)
    {
        int s=0;
        int nik=0;
        while((s<5)||(s<=10))
        {
            nik=nik+s;
            s++;
            System.out.println(nik);
        }
    }
}
