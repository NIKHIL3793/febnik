package Company;

import java.util.Scanner;

public class Experience
{
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc =new Scanner(System.in);
        age =sc.nextInt();
        if (age>56)
        {
            System.out.println("you are genius");
        } else if (age>46)
        {
            System.out.println("you are semi genius");
        }
        else if(age>36)
        {
            System.out.println("you are semi semi genius");
        }
        else {
            System.out.println("get out");
        }

    }
}
