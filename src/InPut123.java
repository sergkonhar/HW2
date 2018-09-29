import java.util.Scanner;

public class InPut123 {
    public String [] Inner() {
        System.out.println("Input an amount of numbers");
        Scanner arrayLength = new Scanner(System.in);
        int length = arrayLength.nextInt();
        String[] firstOne = new String[length];



        for (int i = 0; i < firstOne.length; i++) {
            System.out.println("Input number #" + (1 + i));
            String inForArray = arrayLength.next();
            firstOne[i] = inForArray;



        }
        return firstOne;
    }

    public static void main(String[] args) {

    }
}
