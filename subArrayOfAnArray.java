import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        for(int i=0;i<n;i++){
            String s_array="";
            for(int j=i;j<n;j++){
                s_array+=arr[j]+" ";
                System.out.print(s_array+" ");
            }
            System.out.println();
        }
    }    
}
