package Homework;

public class Primeornot {
    public static void main(String[] args) {
        int a=37;
        int sum=0;
        if (a>1){
            for (int i=1;i<=a;i++){
                if (a%i==0)
                    sum++;
                }
                if (sum==2){
                    System.out.println("its a prime number");
                }
                else {
                    System.out.println("its not a prime number");
                }
            }
        }
    }