

public class SecondLargest
{
    public static void main(String[] args)
    {
        int arr[] = {1,5,4,2,10};

        // Arrays.sort(arr);

        // System.err.println("2nd Largest Number : " + arr[arr.length-2]);
           
        int m1=-1,m2=-1,m3=-1;

        for(int i : arr)
        {
            if(i>m1)
            {
                m3=m2;
                m2=m1;
                m1=i;
            }
        }

        System.err.println("2nd Largest NUmber : " + m3);

    }
}