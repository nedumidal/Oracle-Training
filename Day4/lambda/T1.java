public interface T1
{
    void m1();
    void m2();

    public static void main(String args[])
    {
        T1 a = new T1()
        {
            public void m1()
            {
                System.out.println("Hello from M1");
            }

            public void m2()
            {
                System.out.println("Hello from M2");
            }
        };

        a.m1();

        a.m2();
    }
}