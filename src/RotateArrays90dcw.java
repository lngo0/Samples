import java.util.Scanner;

public class RotateArrays90dcw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter size of Array : ");
        num = sc.nextInt();
        int[][] a = new int[num][num];
        System.out.print("Enter  "+ num*num +" Element Array : ");

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nArray Before Rotation\n\n");
        for (int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");
        //Rotation

        //Transpose
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        //Reverse Each row
        for (int i = 0; i < num; i++) {
            int l, j;
            for (j = 0, l = num -1; j < l; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][l];
                a[i][l] = temp;
                l--;
            }
        }

        System.out.println("Array After Rotation - \n");

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
