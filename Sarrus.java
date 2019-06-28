import java.util.*;
import java.lang.*;


public class Sarrus {
    static private Scanner sc = new Scanner(System.in);
    static int [] matrix = new int [9];
    static int [] zero = new int [1];
    static private int x = 0;
    static private int r = 0;
    //static final int z = 0;

    public Sarrus(Scanner sc, int[] matrix, int x, int r) {
        this.sc = sc;
        this.matrix = matrix;
        //this.zero = zero;
        this.x = x;
        this.r = r;
    }

    /*public static int[] Error1(int z) {
        zero[0] = z;
        System.out.println("Please do not insert more than 9 numbers!");
        return zero;
    }
    public static int[] Error2(int z) {
        zero[0] = z;
        System.out.println("Please do not insert less than 9 numbers!");
        return zero;
    }*/
    private static int[] FillArray() {
        System.out.println("Please enter your numbers of your matrix: (not more than 9) ");
        /*if(matrix.length > 9)  {
            Error1(0);
            FillArray();
        }
        if(matrix.length < 9)  {
            Error2(0);
            FillArray();
        }*/
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = sc.nextInt();
        }
        return matrix;
    }

    public static int RuleSarrus() {
        FillArray();
        x = matrix[0]*matrix[4]*matrix[8] + matrix[3]*matrix[7]*matrix[2] + matrix[6]*matrix[1]*matrix[5];
        r = matrix[3]*matrix[1]*matrix[8] + matrix[5]*matrix[7]*matrix[0] + matrix[6]*matrix[4]*matrix[2];
        System.out.println("First result: " + x);
        System.out.println("Second result: " + r);
        r = x - r;
        //System.out.println("Final result: " + r);
        return r;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to this calculator!");
        RuleSarrus();
        System.out.println("Your result is: " + r);

    }
}


