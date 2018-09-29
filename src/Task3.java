import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        InPut123 first = new InPut123();

        String[] a = first.Inner();
int Sum = 0;
        for (int i = 0; i <a.length ; i++) {
            Sum += a[i].length();
        }
int Avr = Sum/a.length;
String lessThanAvr ="";
String greaterThanAvr = "";
        for (int i = 0; i <a.length ; i++) {
            if (a[i].length()>Avr) {
                greaterThanAvr += "  "+a[i];
            }
        else if (a[i].length()<Avr){
                lessThanAvr += "  " + a[i];

            }
        }
        System.out.println("\n"+"Numbers those have length less than average"+ "  "+lessThanAvr);
        System.out.println("\n"+"Numbers those have length greater than average"+ "  "+greaterThanAvr);
    }

}
