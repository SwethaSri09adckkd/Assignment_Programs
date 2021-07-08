import java.util.*;
public class DiagonalMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int row_size,col_size;
		    System.out.print("Enter the row size of the matrix:");
		    row_size=sc.nextInt();
		    System.out.print("Enter the columns size of the matrix:");
		    col_size=sc.nextInt();
		    int matrix[][] =new int[row_size][col_size];
		    int i,j;
		    System.out.println("Enter the Matrix Element:");
		    for(i=0;i<row_size;i++)
		    {
		        for(j=0;j<col_size;j++)
		        {
		            matrix[i][j]=sc.nextInt();
		        }
		    }
		    int flag=0;
		    for(i=0;i<row_size;i++)
		    {
		        for(j=0;j<col_size;j++)
		        {
		        if(i!=j && matrix[i][j]!=0)
		        {
		            flag=1;
		            break;
		        }
		        }
		    }
		    if(flag==1)
		    	 System.out.print("Given matrix is not a diagonal matrix.");
		    else
		    	 System.out.print("Given matrix is a diagonal matrix.");
	}
}