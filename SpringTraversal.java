import java.util.*;
class Main {
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

        int minr=0;
        int minc=0;
        int maxr=m-1;
        int maxc=n-1;

        int total=m*n;
        int count=0;

        while(count<total){
            for(int i=minr,j=minc;i<=maxr && count<total;i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }

            minc++;

            for(int i=maxr,j=minc;j<=maxc && count<total;j++){
                System.out.print(arr[i][j]+" ");
                count++;
            }

            maxr--;

            for(int i=maxr,j=maxc;i>=minr && count<total;i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }

            maxc--;

            for(int i=minr,j=maxc;j>=minc && count<total;j--){
                System.out.print(arr[i][j]+" ");
                count++;
            }

            minr++;

            System.out.println();
        }
    }
}
