import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int d=scn.nextInt();
        int k=scn.nextInt();

        int[] one=fillOneDfromShell(arr,d);
        rotateArray(one,k);
        fillShellfromOneD(arr,one,d);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void fillShellfromOneD(int[][] arr,int[] one,int d){
        int minr=d-1;
        int minc=d-1;
        int maxr=arr.length-d;
        int maxc=arr[0].length-d;

        int x=0;

        for(int i=minr,j=minc;i<=maxr && x<one.length;i++){
            arr[i][j]=one[x++];
        }

        minc++;

        for(int i=maxr,j=minc;j<=maxc && x<one.length;j++){
            arr[i][j]=one[x++];
        }

        maxr--;

        for(int i=maxr,j=maxc;i>=minr && x<one.length;i--){
            arr[i][j]=one[x++];            
        }

        maxc--;

        for(int i=minr,j=maxc;j>=minc && x<one.length;j--){
            arr[i][j]=one[x++];
        }

        minr++;
    }
    public static int calculateSize(int minr,int maxr,int minc,int maxc){
        if(minr==maxr && minc==maxc){
            return 1;
        }

        else if(minr==maxr){
            return maxc-minc+1;
        }

        else if(minc==maxc){
            return maxr-minr+1;
        }

        else{
            return 2*(maxr-minr + maxc-minc);
        }
    }
    public static int[] fillOneDfromShell(int[][] arr,int d){

        int minr=d-1;
        int minc=d-1;
        int maxr=arr.length-d;
        int maxc=arr[0].length-d;

        int size=calculateSize(minr,maxr,minc,maxc);
        int[] res=new int[size];
        int k=0;

        for(int i=minr,j=minc;i<=maxr && k<size;i++){
            res[k++]=arr[i][j];
        }

        minc++;

        for(int i=maxr,j=minc;j<=maxc && k<size;j++){
            res[k++]=arr[i][j];
        }

        maxr--;

        for(int i=maxr,j=maxc;i>=minr && k<size;i--){
            res[k++]=arr[i][j];
        }

        maxc--;

        for(int i=minr,j=maxc;j>=minc && k<size;j--){
            res[k++]=arr[i][j];
        }

        minr++;

        return res;
    }
    public static void rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        if(k<0){
            k+=n;
        }

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr,int li,int hi){
        while(li<hi){
            int temp=arr[li];
            arr[li]=arr[hi];
            arr[hi]=temp;
            li++;
            hi--;
        }
    }
}