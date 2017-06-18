package arrayTest;

import java.util.*;

public class Array {
	
	private static Scanner scan;

	public static void printArr(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void add2Arr(int arr[]){
		for(int i=0; i<arr.length; i++){
			arr[i] = arr[i]+2;
		}
	}
	
	public static void doubleArr(int arr[]){
		for(int i=0; i<arr.length; i++){
			arr[i] = arr[i]*2;
		}
	}

	public static void main(String[] args) {
		String names[] = {"David", "Andy", "Johnny"};
		int ages[] = { 31, 29, 30};
		for(int i=0; i<names.length; i++){
			System.out.println(names[i] + " is " + ages[i] + " years old.");
		}
		
	    int arr[] = new int[5];
	    for(int i=0; i<arr.length; i++){
	       	System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	    
	    add2Arr(arr);
	    printArr(arr);
	    doubleArr(arr);
	    printArr(arr);
	    
	    int matrix[][] = { {2,3,1}, {1,2,4}, {-1,-3,5}};
	    //double matrix[][] = new double[5][4];
	    for(int i=0; i<matrix.length; i++){
	    	    for(int j=0; j<matrix[i].length; j++){
	    	         System.out.print(matrix[i][j] + " ");
	    	    }
	    	    System.out.println();
	    }
	    
	    scan = new Scanner(System.in);
	    System.out.print("row = ");
	    int row = scan.nextInt();
	    System.out.print("col = ");
	    int col = scan.nextInt();
	    System.out.println("row is " + row);
	    System.out.println("col is " + col);
	    int arrDynamic[][] = new int[row][col];
	    for(int i=0; i<row; i++){
	        for(int j=0; j<col; j++){
	        	    System.out.print(arrDynamic[i][j] + " ");
	        }
	        System.out.println();
	    }
	    
	}
}
