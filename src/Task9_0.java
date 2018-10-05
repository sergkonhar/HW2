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
           int maxValue = size.nextInt();

           Random nRand = new Random();
           int [][] randomArray = new int[a][b];
           for (int i = 0; i <a ; i++) {
               for (int j = 0; j <b ; j++) {
                   randomArray[i][j]= nRand.nextInt(maxValue)+1;
               }
           }
           for (int i = 0; i <a ; i++) {
               for (int j = 0; j <b ; j++) {
                   System.out.print(randomArray[i][j]+" ");
               }
               System.out.println();
           }




       }
    catch (Exception e){
        System.out.println("Wrong format. Potentially there is a wrong separator" + "  "+e );
    }



    }

}
