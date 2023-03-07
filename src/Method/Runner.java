package Method;

import Variable.Nonstatic;
import Variable.Static;

public class Runner {
    public static void main(String[] args) {
        Nonstatic heaven=new Nonstatic();
        int d=heaven.age;
        Nonstatic mike=new Nonstatic();
        int j=mike.age;
        System.out.println(d);
        System.out.println(j);
        int g= Static.age;
        System.out.println(g);
    }
}
