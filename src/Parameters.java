public class Parameters {
    public int age(int a,int b)
    {
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Parameters obj=new Parameters();
        int w= obj.age(33,55);
        System.out.println(w);
    }
}
