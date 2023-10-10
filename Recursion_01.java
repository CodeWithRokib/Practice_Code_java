public class Recursion_01 {
    public static int myNum(int k){
        if(k>0){
            return k + myNum(k-1);
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int sum = myNum(10);
        System.out.println(sum);
    }
}
