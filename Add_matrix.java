import java.util.Scanner; 
public class Add_matrix {
	public static void main(String args[])
	{
	int row, col,i,j;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	row = s.nextInt();
	System.out.println("Enter the number columns:");
	col = s.nextInt();
	int matx1[][] = new int[row][col];
	int matx2[][] = new int[row][col];
	int res[][] = new int[row][col]; 
	System.out.println("Enter the elements of matrix 1:");
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	matx1[i][j] = s.nextInt();
	System.out.println();
	}
	System.out.println("Enter the elements of matrix 2:");
	for ( i= 0 ; i < row ; i++ )
	{
	for ( j= 0 ; j < col ;j++ )
	matx2[i][j] = s.nextInt();
	System.out.println();
	}
	for ( i= 0 ; i < row ; i++ )
	for ( j= 0 ; j < col ;j++ )
	res[i][j] = matx1[i][j] + matx2[i][j] ; 
	System.out.println("Sum of matrices:");
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	System.out.print(res[i][j]+"\t");
	System.out.println();
	}
 
	}
}