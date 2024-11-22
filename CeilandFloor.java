import java.util.*;

import javax.swing.plaf.synth.SynthTextAreaUI;
class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int item=scn.nextInt();
        int low=0;
        int high=n-1;

        int floor=Integer.MIN_VALUE;
        int ceil=Integer.MAX_VALUE;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>item){
                ceil=arr[mid];
                high=mid-1;
            }
            else if(arr[mid]<item){
                floor=arr[mid];
                low=mid+1;
            }
            else{
                low=arr[mid];
                high=arr[mid];
                break;
            }
        }

        System.out.println(ceil+" "+floor);
    }
}
