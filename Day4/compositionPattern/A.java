class parent
{
    void print()
    {
        System.out.println("A's Print called ..!");
    }
}


class child
{
    parent ob1;

    void create()
    {
        ob1=new parent();
    }

    void call()
    {
        ob1.print();
    }
}

public class A
{
    public static void main(String[] args)
    {
        child ob1 = new child();

        ob1.create();

        ob1.call();
        
    }
}