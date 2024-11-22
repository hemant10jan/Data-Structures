import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<Math.pow(2,n);i++){
            String res="";
            for(int j=0;j<n;j++){
                int mask=1<<j;
                if((i & mask)!=0){
                    res+="_ ";
                }
                else{
                    res+=arr[j]+" ";
                }
            }
            System.out.println(i+" "+res);
        }
    }
}
