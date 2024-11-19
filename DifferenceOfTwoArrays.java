import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] num1=new int[n1];
        for(int i=0;i<n1;i++){
            num1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int[] num2=new int[n2];
        for(int i=0;i<n2;i++){
            num2[i]=scn.nextInt();
        }

        int l=Math.max(n1,n2);
        int[] res=new int[l];

        int carry=0;
        int i=n1-1;
        int j=n2-1;
        int k=l-1;

        while(i>=0 || j>=0){
            int d1=(i>=0?num1[i]:0);
            int d2=(j>=0?num2[j]:0);

            int diff=d1-d2+carry;

            if(diff<0){
                diff+=10;
                carry=-1;
            }

            res[k]=diff;
            i--;
            j--;
            k--;
        }

        int x=0;

        while(x<l && res[x]==0){
            x++;
        }

        while(x<l){
            System.out.print(res[x]+" ");
            x++;
        }
    }
}