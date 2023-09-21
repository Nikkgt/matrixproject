package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1,6,7,2},
                          {6,4,3,1},
                          {1,3,4,1}};
        int[][] resultMatrix = turnMatrixToTheRight(matrix);
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static int [][] turnMatrixToTheLeft(int[][] inputMatrix){
        int [][] turnedMatrix = new int[inputMatrix[0].length][inputMatrix.length];

        for(int j = inputMatrix[0].length-1, k = 0; j>=0; j--, k++){
            for (int i = 0; i < inputMatrix.length; i++) {
                turnedMatrix[k][i] = inputMatrix[i][j];
            }
        }
        return turnedMatrix;
    }
    public static int [][] turnMatrixToTheRight(int[][] inputMatrix){
        int [][] turnedMatrix = new int[inputMatrix[0].length][inputMatrix.length];

        for (int j = 0; j < inputMatrix[0].length; j++) {
            for (int i = inputMatrix.length-1, k = 0; i >= 0; i--, k++) {
                turnedMatrix[j][k] = inputMatrix[i][j];
            }
        }
        return turnedMatrix;
    }
}