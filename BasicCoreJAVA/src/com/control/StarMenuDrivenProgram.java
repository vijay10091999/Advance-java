package com.control;

import java.util.Scanner;

public class StarMenuDrivenProgram {

	public static void main(String[] args) {
		System.out.println("::Welcome to star Menu driven code::");
		System.out.println("Enter no of rows and columns :");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		while (true) {
			// create menu
			System.out.println("1.Left Star Pattern \n2.Right Star Pattern \n3.Pyramid Star Pattern \n4.Exit");
			int choice = sc.nextInt();
			int row, column, space;

			for (row = 1; row <= no; row++) {
				for (space = 1; space <= (no - row); space++) {
					if (choice == 1 || choice == 3) {
						System.out.print(" ");
					}
				}

				for (column = 1; column <= row; column++) {
					if (choice == 1 || choice == 2) {
						System.out.print("*"); // for left and right star
					} else if (choice == 3) {
						System.out.print(" *"); // for pyramid star
					}
				}

				System.out.println();

			}
			if (choice == 4) {
				System.exit(0); // exit
			}
		}
	}
	}
