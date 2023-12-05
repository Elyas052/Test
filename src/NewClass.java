import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {
       int[] intArr = {1,2,3,4};
        sumOfNum(intArr);
    }
    public static int sumOfNum(int[] arr){
        int sum = 0;
        for (int each: arr){
            sum += each;
        }
        return sum;
    }

    public static void hello(){
        System.out.println("Hello Everyone ");
    }

    public static void bye(){
        System.out.println("Goodbye");
    }
}
