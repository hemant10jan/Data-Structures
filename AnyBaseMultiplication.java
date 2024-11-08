import java.util.*;
public class AnyBaseMultiplication {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int base=scn.nextInt();

        int pow=1;
        int res=0;

        while(num1>0){
            int dig1=num1%10;
            int cres=getProductWithSingleDigit(num2,dig1,base);
            res=AnyBaseAddition(res,cres*pow,base);
            num1=num1/10;
            pow=pow*10;
        }

        System.out.println(res);

    }

    public static int getProductWithSingleDigit(int num,int digit,int base){
        int carry=0;
        int pow=1;
        int res=0;

        while(num>0 || carry>0){
            int d=num%10;

            int multi=digit*d+carry;
            int cdig=multi%base;
            carry=multi/base;

            res=res+cdig*pow;
            num=num/10;
            pow=pow*10;
        }
        
        return res;
    }

    public static int AnyBaseAddition(int num1,int num2,int base){
        int res=0;
        int pow=1;
        int carry=0;

        while(num1>0 || num2>0 || carry>0){
            int dig1=num1%10;
            int dig2=num2%10;

            int sum=dig1+dig2+carry;
            int cdig=sum%base;
            carry=sum/base;

            res = res + cdig*pow;

            num1=num1/10;
            num2=num2/10;
            pow=pow*10;
        }

        return res;
    }
}
