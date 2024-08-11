package com.leetcode.tryouts;

/**
 * My own question - 2 D matrix
 * @author Poornima Vadakeyil
 *
 */
public class MatrixDiagonal {
	
	
	public static void main(String[] matrixInput) {
		
		printMatrixDiagonalValues(matrixInput);
	}

	public static void printMatrixDiagonalValues(String[] matrixInput) {
			Integer xLenght = Integer.parseInt(matrixInput[0]);
			Integer yLenght = Integer.parseInt(matrixInput[1]);
			Integer[][] twoDMatrix = new Integer[xLenght][yLenght];
			int inputPointer = 2;
			for(int x=0; x < xLenght ; x++) {
				for(int y =0; y < yLenght ; y++) {
					twoDMatrix[x][y] = Integer.parseInt(matrixInput[inputPointer]);
					inputPointer++;
				}
			}
			System.out.println("\n Complete matrix");
			for(int x=0; x < xLenght ; x++) {
				
				StringBuilder matrixRow = new StringBuilder("");
				for(int y =0; y < yLenght ; y++) {
					matrixRow.append(twoDMatrix[x][y].toString()).append("  ");
				}
				System.out.println(matrixRow);
			}
			
			System.out.println("\n Diagonal values");
			StringBuilder diagonalValues = new StringBuilder("");
			for(int x=0; x < xLenght ; x++) {
				diagonalValues.append(twoDMatrix[x][x].toString()).append("  ");
				
			}
			
			System.out.println(diagonalValues);
			
			System.out.println("\n my process ID -->"+ ProcessHandle.current().pid());
	}

}
