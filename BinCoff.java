import java.util.*;
public class BinCoff {
    public static int fact(int num){
        int f = 1;
        for(int i = num; i>=1;i--){
            f= f*i;
        }
        return f;
    }
    public static int Bin_Coeff(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr= fact(n-r);
        int result = (n_fact/(r_fact*nmr));
        return result;
    }
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = in.nextInt();
        System.out.println("Enter the value of r : ");
        int r = in.nextInt();
        int ans = Bin_Coeff(n,r);
        System.out.println("Binary coefficient is : "+ ans);
    }
}