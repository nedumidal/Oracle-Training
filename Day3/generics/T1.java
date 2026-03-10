public class T1 <T,U>
{
    private T name;
    private U version;

    public T1(T name , U version)
    {
        this.name=name;
        this.version=version;
    }

    T getFirst()
    {
        return name;
    }

    U getSecond()
    {
        return version;
    }

    public static void main(String[] args)
    {
        T1<String , Integer> obj = new T1<>("Java",17);

        System.out.println(obj.getFirst()+" "+obj.getSecond());
    }
}