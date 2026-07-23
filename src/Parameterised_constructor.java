public class Parameterised_constructor {
    int age;
    String name;
    //Default Constructor
    Parameterised_constructor()
    {
        age=10;
        name="Guru";
    }
    // parameterised constructor
    Parameterised_constructor(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public static void main(String args[])
    {
        Parameterised_constructor obj1=new Parameterised_constructor();
        Parameterised_constructor obj2=new Parameterised_constructor(20,"Guruprasanth");

        System.out.println(obj1.name +" : "+obj1.age);
        System.out.println(obj2.name +" : "+obj2.age);
    }
}
