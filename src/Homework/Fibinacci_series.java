package Homework;

public class Fibinacci_series {
    public static void main(String[] args) {
        int n= 100;
        int a=0;
        int b=1;
        int c;
        for (c=a+b;c<=n;c++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
