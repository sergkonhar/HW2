import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        System.out.println("\n" + "Input the K");
        Scanner kIn = new Scanner(System.in);
        int kValue = kIn.nextInt();

        int[][] kArray = new int[kValue][kValue];

        for (int i = 0; i < kArray.length; i++) {
            for (int j = 0; j < kArray[i].length; j++) {
                kArray[i][j] = 1 + j;
            }

        }
        for (int i = 0; i < kArray.length; i++) {
            for (int j = 0; j < kArray[i].length; j++) {
                System.out.print(kArray[i][j] + "  ");
            }
            System.out.println();
        }


        for (int i = 0; i < kArray.length; i++) {
            for (int j = 0; j < kArray[i].length; j++) {
                kArray[i][j] = 1 + i;
            }


        }
        System.out.println();
        for (int i = 0; i < kArray.length; i++) {
            for (int j = 0; j < kArray[i].length; j++) {
                System.out.print(kArray[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < kArray.length; i++) {
            for (int j = 0; j < kArray[i].length; j++) {
                if (j == 0) {
                    kArray[i][j] = 1 + i;
                } else kArray[i][j] = 1 + j;
            }


        }
        System.out.println();
        for (int i = 0; i < kArray.length; i++) {
            for (int j = 0; j < kArray[i].length; j++) {
                System.out.print(kArray[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < kArray.length; i++) {

            for (int j = 0; j < kArray[i].length - i; j++) {
                if (j == 0) {
                    kArray[i][j] = 1 + i;
                }
                else kArray[i][j] = 1 + j+i;
            }


        }

        System.out.println();
        for (int i = 0; i < kArray.length; i++) {
            for (int j = 0; j < kArray[i].length-i; j++) {
                System.out.print(kArray[i][j] + "  ");
            }
            System.out.println();
        }

    }
}