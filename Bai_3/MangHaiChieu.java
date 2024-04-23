import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDimensionalArrayTasks {

    public static void main(String[] args) {
        int[][] matrix = {
            {5, 1, 3},
            {2, 4, 6},
            {9, 8, 7}
        };

        System.out.println("Mang ban dau:");
        printMatrix(matrix);

        sortMatrix(matrix);
        System.out.println("\nMang sap xep tang dan:");
        printMatrix(matrix);

        int[][] filteredMatrix = filterMatrix(matrix);
        System.out.println("\nMang da loai bo phan tu nho hon gia tri trung binh:");
        printMatrix(filteredMatrix);
        
        System.out.println("\nTat ca mang con co the:");
        listAllSubarrays(matrix);
    }

    public static void sortMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] temp = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[index++] = matrix[i][j];
            }
        }
        Arrays.sort(temp);
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = temp[index++];
            }
        }
    }

    public static int[][] filterMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        double average = sum / count;
        List<List<Integer>> filteredList = new ArrayList<>();
        for (int[] row : matrix) {
            List<Integer> filteredRow = new ArrayList<>();
            for (int element : row) {
                if (element >= average) {
                    filteredRow.add(element);
                }
            }
            if (!filteredRow.isEmpty()) {
                filteredList.add(filteredRow);
            }
        }
        int[][] filteredMatrix = new int[filteredList.size()][];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredMatrix[i] = filteredList.get(i).stream().mapToInt(Integer::intValue).toArray();
        }

        return filteredMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void listAllSubarrays(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int startRow = 0; startRow < rows; startRow++) {
            for (int startCol = 0; startCol < cols; startCol++) {
                for (int endRow = startRow; endRow < rows; endRow++) {
                    for (int endCol = startCol; endCol < cols; endCol++) {
                        for (int i = startRow; i <= endRow; i++) {
                            for (int j = startCol; j <= endCol; j++) {
                                System.out.print(matrix[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
