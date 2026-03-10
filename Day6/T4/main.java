import java.util.*;

public class main
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(10,15,20,25,30);

        

        System.out.println(list.stream().filter( x -> x%2==0).count());
    }
}