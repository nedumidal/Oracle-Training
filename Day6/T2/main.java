
import java.util.*;

public class main
{
    public static void main(String[] args) 
    {
        List<Integer> l = new ArrayList<>(List.of(5,9,1,7,3,8,2));

        l.stream()
        .sorted((a,b) -> b-a)
        .limit(3)
        .forEach(System.out::println);
    }
}