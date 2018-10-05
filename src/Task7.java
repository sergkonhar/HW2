public class Task7 {
    public static void main(String[] args) {


        InPut123 newIn = new InPut123();
        String[] newArr = newIn.Inner();
        char[][] newChar = new char[newArr.length][];

        for (int i = 0; i < newArr.length; i++) {
            newChar[i] = newArr[i].toCharArray();


        }
        boolean somethingWasFound = false;
        for (int i = 0; i <newChar.length ; i++) {
            int counter = 0;
            for (int j = 0; j <newChar[i].length ; j++) {
                if (newArr[i].indexOf(newChar[i][j])==newArr[i].lastIndexOf(newChar[i][j])){
                    counter += 1;

                }
            }
        if (counter==newChar[i].length){
            System.out.println("\n"+"This one contains only unique digits"+ "  "+ newArr[i]);
            somethingWasFound = true;
            break;
        }
        }
if(!somethingWasFound){
    System.out.println("\n"+"There is no number that meet criterion");

}

    }
    }

