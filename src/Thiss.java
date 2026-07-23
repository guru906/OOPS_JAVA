public class Thiss {

    /// This keyword refer current object and they have same name for local and instance variable

    private int age;
    private String name;

    public static void main(String args[])
    {
        Thiss obj=new Thiss();
        obj.setAge(30);
        obj.setname("Ravi");
        System.out.println(obj.getname()+": "+obj.getAge());
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public void setname(String b)
    {
        this.name=b;
    }

    public String getname()
    {
        return name;
    }
}
