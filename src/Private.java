public class Private {
    private int add(int a,int b)
    {
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Private obj=new Private();
        int r= obj.add(12,26);
        System.out.println("just"+r);
    }
}
