import java.util.Random;
import java.util.Scanner;

public class Task9_0 {
    public static void main(String[] args) {
       try {


           System.out.println("\n" + "Input the size of matrix in format NxN example 3x3");
           Scanner size = new Scanner(System.in);
           String marixSize = size.next();
           int a = Integer.parseInt(marixSize.split("x")[0]);
           int b = Integer.parseInt(marixSize.split("x")[1]);
           System.out.println("\n" + "Input the maximal number");
           int maxValue = size.nextInt()+1;
           System.out.println("\n" + "Input the minimal number");
           int minValue = size.nextInt();
           System.out.println("\n" + "Input the amount of positions to shift");
           int shift = size.nextInt();

           Random nRand = new Random();
           int[][] randomArray = new int[a][b];
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   randomArray[i][j] = minValue + (nRand.nextInt((maxValue )) * 2);
               }
           }
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   System.out.print(randomArray[i][j] + " ");
               }
               System.out.println();
           }

           int helper = 0;
           for (int i = 0; i < b; i++) {
               for (int j = a; j >= 0; j--) {
                   for (int k = 0; k < j - 1; k++) {
                       if (randomArray[i][k] > randomArray[i][k + 1]) {
                           helper = randomArray[i][k];
                           randomArray[i][k] = randomArray[i][k + 1];
                           randomArray[i][k + 1] = helper;

                       }
                   }
               }
           }

           System.out.println("\n" + "array sorted in horizontal plane");
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   System.out.print(randomArray[i][j] + " ");
               }
               System.out.println();
           }
           int helper1 = 0;
           for (int i = 0; i < b; i++) {
               for (int j = a; j >= 0; j--) {
                   for (int k = 0; k < j - 1; k++) {
                       if (randomArray[k][i] > randomArray[k + 1][i]) {
                           helper1 = randomArray[k][i];
                           randomArray[k][i] = randomArray[k + 1][i];
                           randomArray[k + 1][i] = helper1;

                       }
                   }
               }
           }
           System.out.println("\n" + "array sorted in vertical plane");
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   System.out.print(randomArray[i][j] + " ");
               }
               System.out.println();
           }

           for (int s = 0; s <shift ; s++) {


           for (int i = 0; i < a; i++) {
               int count = 0;
               int h1 = 0;
               int h2 = 0;
               for (int j = 0; j < b; j++) {
                   count += 1;
                   if (j == b - 1 & count % 2 != 0) {
                       randomArray[i][0] = h1;
                   }
                   if (j == b - 1 & count % 2 == 0) {
                       randomArray[i][0] = h2;
                   }
                   if (count % 2 != 0 & j != b - 1 & count == 1) {
                       h1 = randomArray[i][j];
                       h2 = randomArray[i][j + 1];
                       randomArray[i][j + 1] = h1;

                   }
                   if (count % 2 != 0 & j != b - 1 & count != 1) {

                       h2 = randomArray[i][j + 1];
                       randomArray[i][j + 1] = h1;
                       h1 = randomArray[i][j];
                   }
                   if (count % 2 == 0 & j != b - 1) {
                       h1 = randomArray[i][j + 1];

                       randomArray[i][j + 1] = h2;
                       h2 = randomArray[i][j];
                   }

               }
           }
       }
           System.out.println("\n"+"Shifted to the right by"+" "+shift+" "+ "positions");
           for (int i = 0; i <a ; i++) {
               for (int j = 0; j <b ; j++) {
                   System.out.print(randomArray[i][j]+" ");
               }
               System.out.println();
           }


           System.out.println("\n"+"Loop");

               for (int j = 0; j <b ; j++) {
                   System.out.print((j+1)%b);
               }
               System.out.println();


       }
    catch (Exception e){
        System.out.println("Wrong format. Potentially there is a wrong separator" + "  "+e );
    }



    }

}
