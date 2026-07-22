import java.util.*;
public class Static_Class {
    static String name="guruprasanth";
    int mark;
    public static void main(String args[])
    {
        Static_Class s1=new Static_Class();
        s1.name="guru";
        s1.mark=90;
        Static_Class s2=new Static_Class();
        s2.name="surya";
        s2.mark=91;
        Static_Class obj[]=new Static_Class[2];
        obj[0]=s1;
        obj[1]=s2;

        for(int i=0;i<obj.length;i++)
        {
            System.out.println(obj[i].name+" : "+obj[i].mark);
        }

    }
}
