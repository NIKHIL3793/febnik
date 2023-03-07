package Runner;

import Acessmodifier.Privateaccessmodifier;
import Acessmodifier.Publicaccessmodifier;

public class accessrunners {
    public static void main(String[] args)
    {
        Publicaccessmodifier zen=new Publicaccessmodifier();
        int c=zen.add(144);
        System.out.println(c);
    }
    Privateaccessmodifier cen=new Privateaccessmodifier();



}
