package dayone;

public class Main {
    public static void main(String[] args) {
        printMyNickName();
        addTwoNumbersAndReturnDecimal(25.00F);
        System.out.println(addTwoNumbersAndReturnDecimal(25.00F));
        System.out.println(multiplyTwoNumbers(3, 7));
        System.out.println(addTwoNumbersThenMultiply(3, 7, 6));

    }

    public static void printMyNickName(){
        System.out.println("My nickname is not Peter");
    }
    //a method that takes one parameter and returns a decimal
    public static float addTwoNumbersAndReturnDecimal(float x){
        float y = 2.5F;
        return y + x;
    }
    public static int multiplyTwoNumbers(int x, int y){
        return x*y;
    }
    public static int addTwoNumbersThenMultiply(int x,int y, int z){
        return z * (x + y );
    }
}
