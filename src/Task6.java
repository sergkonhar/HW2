import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        InPut123 newInput = new InPut123();
        String[] newArray = newInput.Inner();
        int[][] newIntArray = new int[newArray.length][];
        char[][] newCharArray = new char[newArray.length][];
        for (int i = 0; i < newArray.length; i++) {
        newCharArray[i] = newArray[i].toCharArray();

        }
        int a =0;
        int b =0;
int[] compare = new int[newCharArray.length];

        for (int i = 0; i <newCharArray.length ; i++) {
            int helper = 0;
            for (int j = 0; j < newCharArray[i].length-1; j++) {


                    if(newCharArray[i][j]-'0'<newCharArray[i][j+1]-'0'){
                       helper+=1;


                    }

            }
            compare[i] = helper;
        }

        for (int i = 0; i <newArray.length ; i++) {
            if(compare[i]==newArray[i].length()-1){
                System.out.println("\n"+"Number that consist of digits in descending order"+"  "+newArray[i]);
                break;


            }
        }
    }
}