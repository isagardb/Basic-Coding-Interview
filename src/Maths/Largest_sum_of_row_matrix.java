package Maths;
import java.util.*;
public class Largest_sum_of_row_matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row  = sc.nextInt(); // row size
		
		int col = sc.nextInt(); // column size
		
		int[][] arr = new int[row][col]; // MultiDimentional array
		int[] res = new int[row+col]; // inserting sum of row into this array
		
		int val = 0;
		
		// getting matrix elements
		for(int i = 0 ;i<row;i++) {
			for(int j = 0 ; j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//printing Array for reference
		for(int[] a : arr) {
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		// summing row elements 
		for(int i = 0 ;i <row;i++) {
			for(int j = 0 ;j <col ;j++) {
				val = val + arr[i][j];
			}
			res[i] = val; // storing summed elements to array
			val = 0;
		}
	
		// getting largest sum number
		int x = sort(res);
		
		//Printing Largest Sum in Matrix
		System.out.print(x);
	}
	
	//Bubble sort Algorithm for sorting summed array 
	public static int sort(int[] arr) {
		int n =0;
		int temp;
		for(int i = 0 ; i<arr.length-1;i++) {
			for(int j = 0 ; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					temp=0;
					}
				}	
			}
		
		// Returning Largest sum number
		n = arr[arr.length-1];
		
		return n;
	}

}


/*
 
input:  3  //Row
		4  //Column
		
		// Matrix Elements
		5
		7
		2
		5
		3
		2
		5
		7
		2
		6
		2
		7
		
		//Printing Matrix For reference
		5 7 2 5     // sum : 19
		3 2 5 7     // sum : 17
		2 6 2 7     // sum : 17
		
		//Largest sum 
		output : 19
 

*/
