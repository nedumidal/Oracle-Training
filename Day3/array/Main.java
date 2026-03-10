public class Main
{
    public static void main(String[] args) {
        
        Object arr[] = {1,2,3,4,"Moon"};

        // for(int i=0;i<arr.length;i++)
        // {
        //     System.err.println("array["+i+"] : " + arr[i]);
        // }

        for(Object a : arr)
            System.out.println(a);
    }
}