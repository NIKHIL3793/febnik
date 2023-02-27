public class Return {
    public int age()
    {
        int a=12;
        int b=33;
        int c=88;
        int e=a+b+c;
        return e;
    }
    public static void main (String[] args)
    {
        Return obj=new Return();
        int e= obj.age();
        System.out.println(e);
    }
}
