package Loops;

public class Dowhile {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        do {
            sum=sum+i;
            i++;
        }
        while (i<=10);
        System.out.println(sum);
    }
}
