public class Recursion_02 {
    public static int myNum(int start, int end){
        if(end > start){
            return end + myNum(start, end - 1);
        }else {
            return end;
        }
    }

    public static void main(String[] args) {
        int sum = myNum(5,10);
        System.out.println(sum);
    }
}
