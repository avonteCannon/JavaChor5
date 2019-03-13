public class Calculator {
    public static void main(String[] args) {
        System.out.println(Add(4, 7));
        System.out.println(Subtract(4, 7));
        System.out.println(Multiply(4, 7));
        System.out.println(Divide(4, 7));
        System.out.println(Exponets(4, 7));


    }
    public static int Add(int x, int y){
        return x+y;
    }
    public static int Subtract(int x, int y){
        return x-y;
    }
    public static int Multiply(int x, int y){
        return x*y;
    }
    public static int Divide(int x, int y){
        return x/y;
    }
    public static double Exponets(double x, double y){
        return Math.pow(x, y);
    }

}
