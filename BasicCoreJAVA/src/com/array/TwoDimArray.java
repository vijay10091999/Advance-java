package com.array;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=3;
		int col=3;
		//int [][] sum;
		
		//int [] [] a = new int[row][col];
		   int[][] a= {{10,20,30},{40,50,60},{70,90,40}};
		   int[][] b= {{10,20,30},{40,50,60},{70,90,40}};
		   int[][] sum= {{0,0,0},{0,0,0},{0,0,0}};
		      for(int i = 0; i< row; i++) {
				 for(int j = 0; j<col ; j++) {
						System.out.print(a[i][j]+ " ");
				 }
					System.out.println(" ");
				}
				System.out.println(" "); 
				   for(int i = 0; i< row; i++) {
						 for(int j = 0; j<col ; j++) {
								//System.out.print(a[i][j]+ " ");
								System.out.print(b[i][j]+ " ");
								
							}
							System.out.println(" ");
						}
						System.out.println(" "); 
						
						   for(int i = 0; i< row; i++) {
								 for(int j = 0; j<col ; j++) {
										sum[i][j] = sum[i][j]+a[i][j]+b[i][j];
										System.out.print(sum[i][j] + " ");
									}
									System.out.println(" ");
								}
								System.out.println(" "); 
				
				//task -> addtion :
				
				
	}

}
