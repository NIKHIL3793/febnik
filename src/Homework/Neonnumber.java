package Homework;

public class Neonnumber {
    public static void main(String[] args) {
        int num=9;
        int r=0;
        int sum=0;
        int sq=num*num;
        while(sq!=0){
            r=sq%10;
            sum=sum+r;
            sq=sq/10;
        }
        if (r==num){
            System.out.println("its a neon number"+r);
        }
        else
            System.out.println("its not a neon number");
    }
}
