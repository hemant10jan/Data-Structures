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

        int x=0;
        int y=0;
        int dir=0;

        while(true){
            dir=(dir+arr[x][y])%4;

            if(dir==0){
                y++;
            }
            else if(dir==1){
                x++;
            }
            else if(dir==2){
                y--;
            }
            else{
                x--;
            }

            if(x<0){
                x++;
                break;
            }

            if(y<0){
                y++;
                break;
            }

            if(x==arr.length){
                x--;
                break;
            }

            if(y==arr[0].length){
                y--;
                break;
            }
        }

        System.out.println(x+" "+y);
    }
}
