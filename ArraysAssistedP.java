package phase1programs;

public class ArraysAssistedP {

	public static void main(String[] args) {
		int[] ans = {0,3,6,9,12,15,18,21,24,27,30};         
        System.out.println("Multiplication Table of 3");  
        for (int i = 0; i < ans.length; i++)
            System.out.println("3 * " + i + " = " + ans[i]);
        
        
        int mat[][] = {{2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8, 12, 16}};
        for(int i=0; i< mat.length; i++) 
          {
            for(int j=0; j< mat[i].length; j++) 
              {
                    System.out.print(mat[i][j] + "\t");
              }
          }
	}

}
