package matrixTest;

public class matrixTest {
	public static void printMat(double mat[][]){
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] matAdd(double mat1[][], double mat2[][]){
		int row = mat1.length;
		int col = mat1[0].length;
		double mat[][] = new double[row][col];
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				mat[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		return mat;
	}
	
	public static double[][] matMult(double mat1[][], double mat2[][]){
		 int row = mat1.length;
		 int col = mat2[0].length;
		 double mat[][] = new double[row][col];
		 if(mat1[0].length != mat2.length){
			 System.out.println("Improper two operands for matrix multifilcation.");
		 }
		 else{
			 for(int i=0; i<row; i++){
				 for(int j=0; j<col; j++){
					 for(int k=0; k<mat2.length; k++){
						 mat[i][j] = mat[i][j] + mat1[i][k]*mat2[k][j];
					 }
				 }
			 }
		 }
		 return mat;
	}

	public static void main(String[] args) {
		double matA[][] = {{ 1d, -2.1, 3.2}, { 3d, 4.4, 5d}}; // 2 by 3
		double matB[][] = {{ 2.1, 1.9, 2d}, {2.3, 1.4, -1.23}}; // 2 by 3
        double matC[][] = {{ 1.2, 2.3}, {2d, -1.2}, {2.1, .12}}; // 3 by 2
        printMat(matA);
        System.out.println();
        printMat(matB);
        System.out.println();
        printMat(matAdd(matA, matB));
        System.out.println();
        printMat(matMult(matA,matC));
	}

}
