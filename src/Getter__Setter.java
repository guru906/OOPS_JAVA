public class Getter__Setter {
    int age;
    String name;
    public static void main(String args[])
    {
        Getter__Setter obj=new Getter__Setter();
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
