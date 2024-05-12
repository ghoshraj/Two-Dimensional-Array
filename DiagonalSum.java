package two_d_array;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int sum = 0;
        for(int i=0;i<a.length;i++) {
            sum += a[i][i];
            if (i == a.length/2)
                continue;
            sum+= a[i][a.length-1-i];
        }
        System.out.println(sum);
    }
}
