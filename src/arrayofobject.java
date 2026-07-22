import java.util.*;
public class arrayofobject {
    String name;
    int mark;
    public static void main(String args[])
    {
        arrayofobject s1=new arrayofobject();
        s1.name="guru";
        s1.mark=90;
        arrayofobject s2=new arrayofobject();
        s2.name="surya";
        s2.mark=91;
        arrayofobject obj[]=new arrayofobject[2];
        obj[0]=s1;
        obj[1]=s2;

        for(int i=0;i<obj.length;i++)
        {
            System.out.println(obj[i].name+" : "+obj[i].mark);
        }

    }
}
