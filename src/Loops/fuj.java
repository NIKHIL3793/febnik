package Loops;

public class fuj {
    public static void main(String[] args) {
        int a=0;
        int run=0;
        do {
            run=run+a;
            a++;
        }while (a<10);
        System.out.println("sum of Dowhile"+run);
        a=0;
        run=0;
        while (a<10)
        {
            run=run+a;
            a++;
            System.out.println("sum of while loop"+run);
        }
    }

}
