import java.util.*;
public class FlipSquareSubMatrix {
    public static int[][] FlipSquare(int[][]grid,int x, int y, int k){
        for(int i=x;i<x+k/2;i++){
            int i2= (x+k-1)-(i-x);
            for(int j=y;j<y+k;j++){
                int temp = grid[i][j];
                grid[i][j]=grid[i2][j];
                grid[i2][j]=temp;
            }
        }
        return grid;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[][]grid= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt(),y=sc.nextInt(),k=sc.nextInt();
        int[][] res = FlipSquare(grid, x, y, k);
        for (int[] row : res) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        sc.close();
    }
}



