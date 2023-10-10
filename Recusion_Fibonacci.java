public class Recusion_Fibonacci {
    public static long myNum(long x){
        if(x == 1 || x == 2){
            return 1;
        }else {
            return myNum(x - 1) + myNum(x-2);
        }
    }

    public static void main(String[] args) {
        for (long i = 1; i<=9; i++){
            System.out.print(myNum(i)+" ");
        }

    }
}
