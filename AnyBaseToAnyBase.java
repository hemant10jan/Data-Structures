import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int base1=scn.nextInt();
        int base2=scn.nextInt();

        int res = 0;
        int p = 1;
        while(num>0){
            int r = num % base2;
            num = num / base2;

            res = res + r * p;
            p = p * base1;
        }

        System.out.println(res);
    }
}