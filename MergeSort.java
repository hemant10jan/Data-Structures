import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int[] res=mergeSort(arr,0,n-1);
        for(int item: res){
            System.out.print(item+" ");
        }
    }
    public static int[] mergeSort(int[] arr,int low,int high){
        if(low==high){
            int[] bc=new int[1];
            bc[0]=arr[low];
            return bc;
        }

        int mid=(low+high)/2;
        int[] first=mergeSort(arr,low,mid);
        int[] second=mergeSort(arr,mid+1,high);
        int[] res=merge(first,second);
        return res;
    }
    public static int[] merge(int[] first,int[] second){
        int i=0;
        int j=0;
        int k=0;
        int m=first.length;
        int n=second.length;

        int[] res=new int[m+n];

        while(i<m && j<n){
            if(first[i]<second[j]){
                res[k++]=first[i];
                i++;
            }
            else{
                res[k++]=second[j];
                j++;
            }
        }

        while(i<m){
            res[k++]=first[i++];
        }

        while(j<n){
            res[k++]=second[j++];
        }

        return res;
    }
}
