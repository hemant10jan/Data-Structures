import java.util.*;
class main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        int mlen=Math.max(n1,n2);
        int[] res=new int[mlen];
        int carry=0;
        int i=n1-1;
        int j=n2-1;
        int k=mlen-1;
        while(k>=0){
            int sum=carry;

            if(i>=0){
                sum+=arr1[i--];
            }

            if(j>=0){
                sum+=arr2[j--];
            }

            res[k--]=sum%10;
            carry=sum/10;
        }

        if(carry>0){
            System.out.print(carry+" ");
        }
        
        for(int x=0;x<mlen;x++){
            System.out.print(res[x]+" ");
        }
    }
}
