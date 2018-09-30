import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        InPut123 firstIn = new InPut123();
        String[] baseArray = firstIn.Inner();
        char[][] baseChar = new char[baseArray.length][];
        for (int i = 0; i < baseArray.length; i++) {
            baseChar[i] = baseArray[i].toCharArray();


        }

        int [] length = new int[baseArray.length];

        for (int i = 0; i < baseChar.length; i++) {
            String outPut = "";
            for (int j = 0; j < baseChar[i].length; j++) {
                if(!outPut.contains(String.valueOf(baseArray[i].charAt(j)))){
                    outPut+= baseArray[i].charAt(j);


                }

            }
            length[i]= outPut.length();

        }
        int max = Integer.MAX_VALUE;
        for (int i = 0; i <length.length ; i++) {
            if (length[i]<max){
                max = length[i];
            }
        }

        for (int i = 0; i <length.length ; i++) {
            if (length[i] == max){
                System.out.println("\n"+"The number with minimal minimal number of repetitive digits"+ "   "+baseArray[i]);
            break;
            }
        }





        }
    }










