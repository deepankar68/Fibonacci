import java.util.*;
public class Fibonacci {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = input.nextInt();
        int a = 0, b = 1, c;
        for(int i = 0; i < n; i++){
            System.out.println(a);
            c = a+b;
            a=b;
            b=c;
        }
    }
}