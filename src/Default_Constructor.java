public class Default_Constructor {

    int age;
    String name;

    // Default Constructor

    Default_Constructor() {
        age = 10;
        name = "guru";
    }

    public static void main(String args[]) {

        Default_Constructor obj = new Default_Constructor();

        System.out.println(obj.age + " " + obj.name);
    }
}