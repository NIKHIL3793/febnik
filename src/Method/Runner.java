package Method;

import Variable.Nonstatic;
import Variable.Static;

public class Runner {
    public static void main(String[] args) {
        Nonstatic obj=new Nonstatic();
        int d=obj.age;
        System.out.println(d);
        int g= Static.age;
        System.out.println(g);
    }
}
