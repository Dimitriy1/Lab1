import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MatrixOperations {

    public static void writeMatrixToFile(int[][] matrix,String path) {
        try (FileWriter writer = new FileWriter(path)) {
            for (int i = 0; i < matrix.length; i++) {
                String text = Arrays.toString(matrix[i]);
                writer.append(text.substring(1, text.length() - 1));
                writer.append('\n');
            }

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void reflect(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{82, 38, -7, 3, 4},
                {-85, 36, -29, -97, 10},
                {-62, 33, 63, 57, 40},
                {38, 35, -65, 83, 200},
                {128, 350, -165, 834, 23}};

        showMatrix(matrix);
        MatrixOperations.reflect(matrix);
        System.out.print("\n");
        showMatrix(matrix);
        MatrixOperations.writeMatrixToFile(matrix,"reflected_matrix.txt");

    }
}
