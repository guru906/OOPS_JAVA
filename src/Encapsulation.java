public class Encapsulation {

    /// data which can be access with help of methoods is called encapsulation
    private int age;
   private String name;
    public static void main(String args[])
    {
        Encapsulation obj=new Encapsulation();
        obj.setAge(30);
        obj.setname("Ravi");
        System.out.println(obj.getname()+": "+obj.getAge());
    }
    public void setAge(int a)
    {
        age=a;
    }
    public int getAge()
    {
        return age;
    }
    public void setname(String b)
    {
        name=b;
    }

    public String getname()
    {
        return name;
    }
}
