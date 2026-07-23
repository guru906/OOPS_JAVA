public class A{
    public static void main(String args[])
    {
        B obj=new B(10);
    }

}

class c{
    public c()
    {
        super();
        System.out.println("A");
    }
    public c(int a)
    {
        super();
        System.out.println(a);
    }
}
class B extends c{
    public B()
    {
        super();
        System.out.println("B");
    }
    public B(int b)
    {


        System.out.println(b);
    }
}
