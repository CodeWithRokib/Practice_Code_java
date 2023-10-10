public class Recursion_Factorial {
    public static  long funcFac(long x){
        if(x<=1){
            return 1;
        }else {
            return x * funcFac(x - 1);
        }
    }

    public static void main(String[] args) {
        long facNumber = funcFac(5);
        System.out.println(facNumber);
    }
}
