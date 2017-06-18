package helloWorld;

import java.util.Scanner;

public class helloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java World!");
		float avg = 0;
		int[] grades = new int[10];
		for(int i=0; i<5; i++){
			grades[i] = new Scanner(System.in).nextInt();
		}		
		for(int i=0; i<5; i++){
			avg = avg+ grades[i];
		}
		avg = avg/5;
		System.out.println("Average score is " + avg);
		// Bubble Sorting
		for(int i=5-1;i>0;i--){
			for(int j=0; j<4; j++){
				if(grades[j]>grades[j+1]){
				   int temp = grades[j+1];
				   grades[j+1]=grades[j];
				   grades[j]=temp;
				}
			}
		}
		// print out the results after sorting
		for(int i=0; i<5; i++){
			System.out.print(grades[i] + " ");
		}	
		
	}
}
