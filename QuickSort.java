import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        quickSort(arr,0,n-1);   
        for(int item: arr){
            System.out.print(item+" ");
        }    
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }

        int pIdx=partition(arr,low,high);
        quickSort(arr,low,pIdx-1);
        quickSort(arr,pIdx+1,high);
    }
    public static int partition(int[] arr,int low,int high){
        int pIdx=low;

        while(low<=high){
            if(arr[low]<=arr[high]){
                swap(arr,pIdx,low);
                pIdx++;
                low++;
            }
            else{
                low++;
            }
        }

        return pIdx-1;
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
