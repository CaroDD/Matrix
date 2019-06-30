import java.util.*;
import java.lang.*;


public class Sarrus {
    static private Scanner sc = new Scanner(System.in);
    static int [] matrix = new int [10];
    //static int [] zero = new int [1];
    static private int x = 0;
    static private int r = 0;
    static private int z = 0;

    public Sarrus(Scanner sc, int[] matrix, int x, int r) {
        this.sc = sc;
        this.matrix = matrix;
        //this.zero = zero;
        this.x = x;
        this.r = r;
        this.z = z;
    }

    private static int[] FillArray() {
        System.out.println("Please enter your numbers of your matrix: (not more than 9) ");
        for (int i = 1; i < matrix.length; i++) {
            matrix[i] = sc.nextInt();
        }
        Sarrus(matrix);
        return matrix;
    }

    private static int[] Sarrus(int[] matrix) {
        System.out.println("Please enter your lambda: ");
        matrix[0] = sc.nextInt();
        matrix[1] = matrix[1] - matrix[0];
        matrix[5] = matrix[5] - matrix[0];
        matrix[9] = matrix[9] - matrix[0];
        return matrix;
    }

    public static int RuleSarrus() {
        FillArray();
        x = matrix[1]*matrix[5]*matrix[9] + matrix[4]*matrix[8]*matrix[3] + matrix[7]*matrix[2]*matrix[6];
        r = matrix[4]*matrix[2]*matrix[9] + matrix[6]*matrix[8]*matrix[1] + matrix[7]*matrix[5]*matrix[3];
        r = x - r;
        return r;
    }

    private static void Matrix(int[] matrix) {
        matrix[1] = matrix[1] + matrix[0];
        matrix[5] = matrix[5] + matrix[0];
        matrix[9] = matrix[9] + matrix[0];
        for (int i = 1; i < matrix.length; i++) {
            if(i == matrix.length-1) {
                System.out.print(matrix[i]);
            }
            else {
                System.out.print(matrix[i] + " ");
            }
            if (i == 3 | i == 6) {
                System.out.print('\n');
            }
        }
    }

    @Override
    public String toString() {
        return matrix.toString();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to this calculator!");
        RuleSarrus();
        System.out.println("Your result is: " + r);
        if (r == 0) {
            System.out.println(matrix[0] + " is an intrinsic value of the matrix ");
            Matrix(matrix);
        } else {
            System.out.println(matrix[0] + " is not an intrinsic value of the matrix ");
            Matrix(matrix);
        }
    }
}


