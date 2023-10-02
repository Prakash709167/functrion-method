import java.util.*;
public class Factorial {
    public static int fact(int a){
        int pro=1;
        for(int i = a;i>=1;i--){
            pro = pro*i;
        }
        return pro;
    }
    public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = in.nextInt();
        int result = fact(a);
        System.out.println("The product is : "+ result);

    }
}