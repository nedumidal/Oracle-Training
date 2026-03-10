import java.util.*;
import java.util.stream.Collectors;

public class main
{
    public static void main(String[] args) 
    {
        List<String> list = Arrays.asList("java","python","go");

        Map<String , Integer> hm = list.stream().collect(Collectors.toMap(s-> s, s-> s.length()));

        System.out.println(hm);
    }
}