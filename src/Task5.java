import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {


        InPut123 one = new InPut123();
        String[] oneArray = one.Inner();
char [][] oneCharArray = new char[oneArray.length][];
        for (int i = 0; i <oneArray.length ; i++) {
            oneCharArray[i]=oneArray[i].toCharArray();
        }
    int [][] oneIntArray = new int[oneArray.length][];

 String helper2="";
 for (int i = 0; i <oneIntArray.length ; i++) {
     int helper = 0;
     int helper1 = 0;
     for (int j = 0; j < oneCharArray[i].length ; j++) {
             helper = oneCharArray[i][j]-'0';
if (helper%2==0){
    helper1+=1;
}

            }
        if (helper1== oneArray[i].length()){
            helper2 +="  "+oneArray[i];

        }
        }
        System.out.println("\n"+"Numbers that contains only odd digits" + "  "+helper2);

    }

    }

