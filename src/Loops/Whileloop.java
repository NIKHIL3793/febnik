package Loops;

public class Whileloop
{
    public static void main(String[] args)
    {
     int i=0;
     int gin=0;
     while (i<=10)
     {
         gin=gin+i;
         i++;
         System.out.println("nikhil");
     }
     int f=0;
     int sum=0;
     while (f<=10)
     {
         sum=sum+f;
         if(sum==10)
         {
             break;
         }
         f++;
         System.out.println("hudhud");
     }
     f=0;
     sum=0;
     while (f<=10)
     {
         if (f==4)
         {
             f++;
             continue;
         }
         sum=sum+f;
         f++;
     }



    }
}
