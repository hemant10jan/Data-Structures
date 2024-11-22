import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int item=scn.nextInt();
        
        int lo=0;
        int high=n-1;
        while(lo<=high){
            int mid=(lo+high)/2;

            if(arr[mid]==item){
                System.out.print("Element is available");
                break;
            }
            else if(arr[mid]>item){
                high=mid-1;
            }
            else{
                lo=mid+1;
            }
        }

        if(lo>high){
            System.out.println("Element is not available");
        }
        
        
    }
}

