public class Main <T>
{
    private T a;
    private T b;

    public Main(T a,T b)
    {
        this.a=a;
        this.b=b;
    }

    public static void main(String[] args)
    {
        Main a1=new Main(1, "Hello");

        System.out.println(a1.b);
    }
}