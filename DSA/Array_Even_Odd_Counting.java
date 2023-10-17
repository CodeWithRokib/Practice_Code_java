package DSA;

public class Array_Even_Odd_Counting {
    public static void CountingEvenOdd(int arr[], int array_size){
        int even_count = 0;
        int odd_count = 0;

        for (int i = 0; i<array_size;i++){
            if ((arr[i] & 1) == 1)
                odd_count++;
            else
                even_count++;
        }
        System.out.println("Number of even"
                + " elements = " + even_count
                + " Number of odd elements = "
                + odd_count);
    }
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, 5, 6,7 };
        int n = arr.length;

        // Function Call
        CountingEvenOdd(arr, n);
    }
}
