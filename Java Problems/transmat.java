import java.util.*;
class transmat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int c= sc.nextInt();
        
        int[][] matrix = new int[r][c];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The original matrix is:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < c; i++) 
        {
            for (int j = 0; j < r; j++) 
            {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
