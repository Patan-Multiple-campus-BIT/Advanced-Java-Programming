// 6.	Matrix Operations:
// ●	Design a Java program that performs matrix addition. Define two 2D arrays, add them, and print the result.

public class Question6 {
    static int[][] addMatrix(int[][]matrix1,int[][]matrix2)
    {
        int ans[][] = new int[2][2];
        for(int i=0;i<matrix1.length;i++)
        {
            for(int j=0;j<matrix1[i].length;j++)
            {
                ans[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]
        {
            {1,2},
            {3,4}
        };     
        int[][] matrix2 = new int[][]
        {
            {5,6},
            {7,8}
        };
        int[][] ans= addMatrix(matrix1,matrix2);
        System.out.println("The sum of the given matrix is: ");
        for(int i = 0;i<ans.length;i++)
        {
            for(int j=0;j<ans[i].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    

}
