import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int item=scn.nextInt();
        int first=-1;
        int last=-1;

        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]<item){
                low=low+1;
            }
            else if(arr[mid]>item){
                high=high-1;
            }
            else{
                first=mid;
                high=mid-1;
            }
        }

        low=0;
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]<item){
                low=low+1;
            }
            else if(arr[mid]>item){
                high=high-1;
            }
            else{
                last=mid;
                low=mid+1;
            }
        }

        System.out.println(first+" "+last);
    }
}


// In this Question We need to find first and last index in two iteration 
// We can't do it single iteration


