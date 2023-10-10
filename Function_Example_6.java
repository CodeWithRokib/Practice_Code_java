public class Function_Example_6 {
    public static int myNum(int x, int y){
        return x+y;
    }
    public static double myName(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        int r = myNum(20,30);
        double m = myName(20.00,30.00);
        System.out.println(r);
        System.out.println(m);
    }
}
