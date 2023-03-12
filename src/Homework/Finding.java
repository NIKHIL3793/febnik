package Homework;

public class Finding {
    public static void main(String[] args) {
        int n=123456789;
        int c=0;
        while (n>0){
            n=n/10;
            c++;
            System.out.print(c);
        }
    }
}
