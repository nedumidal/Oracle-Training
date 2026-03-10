import java.lang.*;
import java.util.*;

public class T1 implements Comparable<T1>
{

    private String name;
    private int age;

    public T1(String n ,int a)
    {
        this.name = n;
        this.age = a;
    }

    public int compareTo(T1 t)
    {
        return this.age - t.age;
    }

    public void display()
    {
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) 
    {
        List<T1> list = new ArrayList<>();

        list.add(new T1("Nishanth",19));
        list.add(new T1("Hari",20));
        list.add(new T1("Sabari",18));

        Collections.sort(list);

        for(T1 s : list)
        {
            s.display();
        }
    }
}