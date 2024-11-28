import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int r1=scn.nextInt();
        int c1=scn.nextInt();

        int[][] one=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                one[i][j]=scn.nextInt();
            }
        }

        int r2=scn.nextInt();
        int c2=scn.nextInt();

        int[][] two=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                two[i][j]=scn.nextInt();
            }
        }

        if(r2!=c1){
            System.out.println("We can't perform multiplication on these matrixes.");
        }
        
        int[][] res=new int[r1][c2];

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                int sum=0;
                for(int k=0;k<r2;k++){
                    sum+=(one[i][k]*two[k][j]);
                }
                res[i][j]=sum;
            }
        }

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}