import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("\n"+"Enter amount of  numbers");
        Scanner input = new Scanner(System.in);
        int aLenght =  input.nextInt();
        String[] arrayA = new String[aLenght];
        for (int i = 0; i <arrayA.length ; i++) {
            System.out.println("\n"+"Enter the number #"+i);
        arrayA[i] = input.next();
        }
        for (int i = arrayA.length-1; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if (arrayA[j].length()>arrayA[j+1].length()) {
                    String helper = arrayA[j];
                    arrayA[j] = arrayA[j + 1];
                    arrayA[j+1] = helper;

                }
            }
        }
        System.out.println("\n"+"Numbers arranged by ascending of their lengths" + "   "+ Arrays.toString(arrayA));  for (int i = arrayA.length-1; i >=0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if (arrayA[j].length()<arrayA[j+1].length()) {
                    String helper = arrayA[j];
                    arrayA[j] = arrayA[j + 1];
                    arrayA[j+1] = helper;

                }
            }
        }
        System.out.println("\n"+"Numbers arranged by descending of their lengths" + "   "+ Arrays.toString(arrayA));


    }



}
