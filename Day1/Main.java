

record Student(String name , int age)
{
    void setName(String name)
    {
        this.name=name;
    }
}
public class Main
{
    public static void main(String arg[])
    {

        Student s = new Student("Nish",19);

        s.setName("Moon");

        System.out.println(s.name());  // we can only use Get method
    }
}