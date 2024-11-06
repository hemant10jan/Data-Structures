import java.util.*;
public class AnyBaseAddition {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int base=scn.nextInt();

        int p = 1;
        int res = 0;
        int carry = 0;
        while(num1>0 || num2>0){
            int sum = (num1%10) + (num2%10) + carry;
            int rem = sum % base;

            res = res + rem * p;
            p = p * 10;
            
            num1 = num1 / 10;
            num2 = num2 / 10;
            carry = sum / base;
        }

        res = res + p * carry;
        System.out.println(res);
    }
}
