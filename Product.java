import java.util.*;
public class Product {
    public static int multiple(int a, int b){
        int pro = a*b;
        return pro;
    }
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = in.nextInt();
        System.out.println("Enter the Second number : ");
        int b = in.nextInt();
        int result = multiple(a,b);
        System.out.println("The product is : "+ result);

    }
}