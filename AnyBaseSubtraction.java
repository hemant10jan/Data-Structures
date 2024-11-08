import java.util.*;
class main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int base=scn.nextInt();

        int carry=0;
        int pow=1;
        int res=0;

        while(num1>0 || num2>0){
            int dig1=num1%10;
            int dig2=num2%10;

            int diff=dig1-carry-dig2;
            if(diff<0){
                carry=1;
                diff+=base;
            }
            else{
                carry=0;
            }

            res=res+pow*diff;

            num1=num1/10;
            num2=num2/10;
            pow=pow*10;
        }

        System.out.println(res);
    }
}


// Assumptiom:-  Num1 will be greater that Num2 always