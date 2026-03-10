import java.util.*;

public class main
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(4,2,5,2,3,4,1);

        list.stream()
        .distinct()
        .sorted()
        .forEach(System.out::println);
    }
}