import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        System.out.println("Input a amount of numbers");
        Scanner arrayLength = new Scanner(System.in);
        int length = arrayLength.nextInt();
        String[] firstOne = new String[length];
        String range = "";
        for (int i = 0; i <firstOne.length ; i++) {
            System.out.println("Input number #"+(1+i));
            String inForArray = arrayLength.next();
            firstOne[i] = inForArray;
            range += " " + firstOne[i];

        }
        System.out.println("You have entered following numbers:"+"  "+range );

        String min1="";
        String max2= "";
        for (int i = 0; i <firstOne.length-1 ; i++) {
            if(firstOne[i].length()>firstOne[i+1].length()) {
                max2 = firstOne[i];
                firstOne[i] = firstOne[i + 1];
                firstOne[i + 1] = max2;

            }
        }
        System.out.println("\n"+"The Longest number is" + "  "+ firstOne[firstOne.length-1]+"  "
                +"Andd his length is" + "  "+ firstOne[firstOne.length-1].length());
        for (int i = 0; i <firstOne.length-1 ; i++) {
            if(firstOne[i].length()<firstOne[i+1].length()) {
                min1 = firstOne[i];
                firstOne[i] = firstOne[i + 1];
                firstOne[i + 1] = min1;

            }
        }


        System.out.println("\n"+"The shortest number is" + "  "+ firstOne[firstOne.length-1]+"  "
                +"And his length is" + "  "+ firstOne[firstOne.length-1].length());
    }

}
