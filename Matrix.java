import java.util.Scanner;
import java.util.Arrays;
public class Matrix{
	public static void main(String[] args) {
		Problem obj = new Problem();
		obj.input();
		obj.arrange();
		obj.print();
	} // end of the main method 
}// end of the mail class

class Problem{
Scanner values = new Scanner(System.in);  // Creating a new scanner for whole class
int m,n; // declaring variables to take dimensions of matrix from the user
int[][] mat;
  public boolean input()  // created a method to take input values from the user
  {
     System.out.println("Enter m and n for a matrix");
     m=values.nextInt();
     n=values.nextInt(); //input of dimensions
     mat = new int[m][n];
     System.out.println("Enter values into matrix");
     for(int i=0;i<m;i++)
     {
     	for(int j=0;j<n;j++)
     	{
            mat[i][j]=values.nextInt();
     	}// end of j loop
     }// end of i loop
     return true;
  }//end of the input method

  public boolean arrange()
  {
    for(int[] row : mat)
    {
       sortrow(row);

    }//end of row transverse


 int[][] transposedMatrix = transpose(mat);

        // Sort each row (which corresponds to columns after transposition)
        for (int[] row : transposedMatrix) {
            Arrays.sort(row);
        }

        // Transpose the matrix back to its original form
        mat = transpose(transposedMatrix);
        
      
    return true;
  }// end of arrange method
   
   // Method to transpose a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }

  public static void sortrow(int[] row)
  {
  	Arrays.sort(row);

  }//end of row sort method
  public boolean print()
  {
  	for(int[] row : mat)
    {
       for(int element : row){
         System.out.print(element+" ");
       }//end of coloumn
         System.out.print("\n");
    }//end of row transverse
    return true;
}//end of the print method
}//end of the problem class