import java.util.*;

public class main
{
    public static void main(String[] args) 
    {
        Set<String> ts = new TreeSet<>();

        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add(null);

        System.out.println(ts.size());
    }
}