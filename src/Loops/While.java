package Loops;

public class While {
    public static void main(String[] args)
    {
        int o=1;
        int sum=0;
        do {
            sum=sum+o;
            o++;
        }while (o<1);
        System.out.println("sum of do while"+sum);

        o=1;
        sum=0;
        while (o<1)
        {
            sum=sum+o;
            o++;
        }
        System.out.println("sum of while"+sum);
    }
}
