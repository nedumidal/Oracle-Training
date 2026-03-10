public class RotateArray
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;

        int k = 123%arr.length;

        for(int i=k;i>0;i--)
        {
            int temp = arr[n-1];

            for(int j=n-1; j>0; j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }

        for(int i : arr)
        {
            System.err.println(i);
        }

    }
}