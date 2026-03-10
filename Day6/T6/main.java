import java.util.*;
import java.util.stream.Collectors;

public class main
{
    public static void main(String[] args) 
    {
        List<List<String>> list = new ArrayList<>();

        list.add(Arrays.asList("Alice","IT"));

        list.add(Arrays.asList("Bob","HR"));

        list.add(Arrays.asList("Charlie","IT"));

        list.add(Arrays.asList("David","HR"));

        list.add(Arrays.asList("Eve","Finance"));


        Map<String,String>hm = list.stream()
        .distinct()
        .collect(
            Collectors.toMap(
                s->s.get(1),
                s->s.get(0),
                (oldVal, newVal) -> newVal
                )
            );

        System.out.println(hm);

    }
}