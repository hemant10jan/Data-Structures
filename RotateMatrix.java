import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){ 
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            int x=0;
            int y=arr[0].length-1;

            while(x<y){
                int temp=arr[i][x];
                arr[i][x]=arr[i][y];
                arr[i][y]=temp;
                x++;
                y--;
            }
        }

        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }


    }  
}
