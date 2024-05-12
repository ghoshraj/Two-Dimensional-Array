package two_d_array;

public class Multipication {
    public static void main(String[] args) {
        int[][] a={
            {1,2,3},
            {4,5,6},
            {6,7,8}
        };
        int[][] b={
                {9,10,11},
                {11,12,13,14},
                {15,16,17},

        };
        mul m=new mul();
        int[][] d=m.mull(a,b);
        for(int[] n: d){
            for(int k:n){
                System.out.println(k);
            }
        }
    }
}
class mul{
    public  static  int[][] mull(int[][] a,int[][] b){

        int[][] c=new int[a.length][b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                for(int k=0;k<c.length;k++) {
                    c[i][j] = a[i][k] * b[k][j];
                }
                System.out.println();
            }
        }
        return c;
    }
}
