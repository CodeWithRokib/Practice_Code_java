package DSA;

public class Sum_Of_Digit_Number {
    static int getSum(int n)
    {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 687;

        // Function call
        System.out.println(getSum(n));
    }
}
