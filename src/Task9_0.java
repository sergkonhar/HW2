import java.util.Arrays;
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
           int maxValue = size.nextInt() + 1;
           System.out.println("\n" + "Input the minimal number");
           int minValue = size.nextInt();
           System.out.println("\n" + "Input the amount of positions to shift");
           int shift = size.nextInt();

           Random nRand = new Random();
           int[][] randomArray = new int[a][b];
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   randomArray[i][j] = minValue + (nRand.nextInt((maxValue - minValue)));
               }
           }
           int [][] thirdnewarray = new int[a][b];
           for (int i = 0; i < randomArray.length; i++) {
               for (int j = 0; j < randomArray[i].length; j++) {
                   thirdnewarray [i][j] = randomArray[i][j];
               }
           }
           int[][] secondNewArray = new int[a][b];
           for (int i = 0; i < randomArray.length; i++) {
               for (int j = 0; j < randomArray[i].length; j++) {
                   secondNewArray[i][j] = randomArray[i][j];
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

           for (int s = 0; s < shift; s++) {


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
           System.out.println("\n" + "Shifted to the right by" + " " + shift + " " + "positions");
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   System.out.print(randomArray[i][j] + " ");
               }
               System.out.println();
           }

           int[][] secondArray = new int[a][b];
           int additionalCounter = 1;
           for (int k = 0; k < shift * 2; k++) {

               if (additionalCounter % 2 != 0) {
                   for (int i = 0; i < a; i++) {
                       for (int j = 0; j < b; j++) {
                           secondArray[i][j] = randomArray[i][(j + 1) % b];
                       }
                   }

               }
               if (additionalCounter % 2 == 0) {
                   for (int i = 0; i < a; i++) {
                       for (int j = 0; j < b; j++) {
                           randomArray[i][j] = secondArray[i][(j + 1) % b];
                       }
                   }

               }

               additionalCounter += 1;
           }


           System.out.println("Array shifted left by" + "  " + shift + "  " + "positions");
           if (additionalCounter % 2 != 0) {
               for (int i = 0; i < a; i++) {
                   for (int j = 0; j < b; j++) {
                       System.out.print(randomArray[i][j] + "  ");

                   }
                   System.out.println();
               }
           }
           if (additionalCounter % 2 == 0) {
               for (int i = 0; i < a; i++) {
                   for (int j = 0; j < b; j++) {
                       System.out.print(secondArray[i][j] + "  ");

                   }
                   System.out.println();
               }
           }
           int newcounter = 1;
           for (int i = 0; i < shift; i++) {
               if (additionalCounter % 2 != 0) {
                   if (newcounter % 2 != 0) {
                       for (int j = 0; j < b; j++) {
                           for (int k = 0; k < a; k++) {
                               secondArray[k][j] = randomArray[(k + 1) % a][j];
                           }
                       }
                   }
                   if (newcounter % 2 == 0) {
                       for (int j = 0; j < b; j++) {
                           for (int k = 0; k < a; k++) {
                               randomArray[k][j] = secondArray[(k + 1) % a][j];
                           }
                       }
                   }


               }
               if (additionalCounter % 2 == 0) {
                   if (newcounter % 2 != 0) {
                       for (int j = 0; j < b; j++) {
                           for (int k = 0; k < a; k++) {
                               randomArray[k][j] = secondArray[(k + 1) % a][j];
                           }
                       }
                   }
                   if (newcounter % 2 == 0) {
                       for (int j = 0; j < b; j++) {
                           for (int k = 0; k < a; k++) {
                               secondArray[k][j] = randomArray[(k + 1) % a][j];
                           }
                       }
                   }


               }
               newcounter += 1;


           }


           System.out.println("Array shifted up by" + "  " + shift + "  " + "positions");
           if (newcounter % 2 != 0) {
               for (int i = 0; i < a; i++) {
                   for (int j = 0; j < b; j++) {
                       System.out.print(randomArray[i][j] + "  ");

                   }
                   System.out.println();
               }
           }
           if (newcounter % 2 == 0) {
               for (int i = 0; i < a; i++) {
                   for (int j = 0; j < b; j++) {
                       System.out.print(secondArray[i][j] + "  ");

                   }
                   System.out.println();
               }
           }
           int onemorecounter = 1;
           for (int i = 0; i < shift * 2; i++) {
               if (newcounter % 2 != 0) {
                   if (onemorecounter % 2 != 0) {
                       for (int j = 0; j < b; j++) {
                           for (int k = 0; k < a; k++) {
                               secondArray[(k + 1) % a][j] = randomArray[k][j];
                           }
                       }
                   }
                   if (onemorecounter % 2 == 0) {
                       for (int j = 0; j < b; j++) {
                           for (int k = 0; k < a; k++) {
                               randomArray[(k + 1) % a][j] = secondArray[k][j];
                           }
                       }
                   }


               }
               if (newcounter % 2 == 0) {
                   if (onemorecounter % 2 != 0) {
                       for (int j = 0; j < b; j++) {
                           for (int k = 0; k < a; k++) {
                               randomArray[(k + 1) % a][j] = secondArray[k][j];
                           }
                       }
                   }
                   if (onemorecounter % 2 == 0) {
                       for (int j = 0; j < b; j++) {
                           for (int k = 0; k < a; k++) {
                               secondArray[(k + 1) % a][j] = randomArray[k][j];
                           }
                       }
                   }


               }
               onemorecounter += 1;


           }
           System.out.println("Array shifted  by" + "  " + shift + "  " + "positions");
           if (newcounter % 2 == 0) {
               if (onemorecounter % 2 != 0) {
                   for (int i = 0; i < a; i++) {
                       for (int j = 0; j < b; j++) {
                           System.out.print(secondArray[i][j] + "  ");

                       }
                       System.out.println();

                   }
               }
               if (onemorecounter % 2 == 0) {
                   for (int i = 0; i < a; i++) {
                       for (int j = 0; j < b; j++) {
                           System.out.print(randomArray[i][j] + "  ");

                       }
                       System.out.println();
                   }


               }
           }
           if (newcounter % 2 != 0) {
               if (onemorecounter % 2 != 0) {
                   for (int i = 0; i < a; i++) {
                       for (int j = 0; j < b; j++) {
                           System.out.print(randomArray[i][j] + "  ");

                       }
                       System.out.println();
                   }
               }
               if (onemorecounter % 2 == 0) {
                   for (int i = 0; i < a; i++) {
                       for (int j = 0; j < b; j++) {
                           System.out.print(secondArray[i][j] + "  ");

                       }
                       System.out.println();
                   }


               }
           }

           int[][] helperArray = new int[a][b];

           for (int i = 0; i <a; i++) {
               int removecounter = 0;
               for (int k = b-1; k >=0; k--) {

                   helperArray[i][k] = secondNewArray[a - 1 - removecounter][b-1-i];
                   removecounter += 1;
               }

           }
           System.out.println("90 degrees rotation");
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   System.out.print(helperArray[i][j] + "  ");

               }
               System.out.println();
           }


           int[][] helper2 = new int[a][b];
           for (int i = 0; i < a; i++) {
               int removecounter = 0;
               for (int k = b-1; k >=0; k--) {

                   helper2[i][k] = helperArray[a - 1 - removecounter][b-1-i];
                   removecounter += 1;
               }

           }

           System.out.println("180 degrees rotation");
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   System.out.print(helper2[i][j] + "  ");

               }
               System.out.println();
           }
           int[][] helper3 = new int[a][b];
           for (int i = 0; i < a; i++) {
               int removecounter = 0;
               for (int k = b-1; k >=0; k--) {

                   helper3[i][k] = helper2[a - 1 - removecounter][b-1-i];
                   removecounter += 1;
               }

           }

           System.out.println("270 degrees rotation");
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   System.out.print(helper3[i][j] + "  ");

               }
               System.out.println();
           }
           int[][] substractionArray = new int[a][b];
           int sum = 0;
           int countsum = 0;
           int divider = 0;
           for (int i = 0; i < secondNewArray.length; i++) {
               for (int j = 0; j < secondNewArray[i].length; j++) {
                   sum += secondNewArray[i][j];
                   countsum += 1;
               }

           }
           divider = sum / countsum;

           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   substractionArray[i][j] = secondNewArray[i][j] - divider;

               }
           }
           System.out.println("Array with elements from which mean was subtracted");
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   System.out.print(substractionArray[i][j] + "  ");

               }
               System.out.println();
           }
           int assist;



           for (int i = 0; i < secondNewArray.length; i++) {
               for (int j = secondNewArray[i].length - 1; j >= 0; j--) {
                   for (int k = 0; k < j ; k++) {
                       if (secondNewArray[i][k] == 0) {
                           assist = secondNewArray[i][k];
                           secondNewArray[i][k] = secondNewArray[i][k + 1];
                           secondNewArray[i][k + 1] = assist;

                       }
                   }
               }
           }

           System.out.println("Array where all 0 elements placed in the end");
           for (int i = 0; i < a; i++) {
               for (int j = 0; j < b; j++) {
                   System.out.print(secondNewArray[i][j] + "  ");

               }
               System.out.println();
           }
int sumarray[]=new int[a];
           for (int i = 0; i <a ; i++) {
               breakthis:
               for (int j = 0; j <b ; j++) {
                   if(thirdnewarray[i][j]>=0&j!=b-1&j!=b-2){
                       for (int k = j+1; k <b ; k++) {
                           if (thirdnewarray[i][k]<0){
                           sumarray[i]+=thirdnewarray[i][k];

                           }
                       if (thirdnewarray[i][k]>=0){
                           break breakthis;
                       }
                      if(thirdnewarray[i][k]<0&k==b-1){
                          sumarray[i]=0;
                          break breakthis;
                      }
                       if (k==b-1){
                           break breakthis;
                       }
                       }
                   }
               }
           }
           System.out.println("Sum of elements between two positive numbers in each row");
           for (int i = 0; i <sumarray.length ; i++) {
               System.out.println(sumarray[i]);
           }
           int overal =0;
           for (int i = 0; i <sumarray.length ; i++) {
               overal+=sumarray[i];
           }
           System.out.println("Overall sum of elements between two positive numbers in each row");
           System.out.println(overal);
           int[] onedimension1= new int [a*b];
           int positioncounter1 =0;
           for (int i = 0; i <a ; i++) {
               for (int j = 0; j <b ; j++) {
                   onedimension1[positioncounter1] = thirdnewarray[i][j];
                   positioncounter1+=1;
               }
           }
           int[][]lengthtarray1 = new int[a*b][a*b];
           for (int i = 0; i <a*b ; i++) {
               for (int j = 0; j <a*b ; j++) {
                   lengthtarray1[i][j]=Integer.MAX_VALUE;
               }
           }
           int outer1 = 0;
           int inner1 =0;
           for (int i = 0; i <a*b-1 ; i++) {
               if (onedimension1[i]>onedimension1[i+1]){
                   lengthtarray1[outer1][inner1]=onedimension1[i];
               inner1+=1;
               }
           if (onedimension1[i]<=onedimension1[i+1]){
               lengthtarray1[outer1][inner1]=onedimension1[i];
               outer1+=1;
               inner1 = 0;
           }
               if (i==(a*b)-2){
                   if(onedimension1[i]>onedimension1[i+1]){
                       lengthtarray1[outer1][inner1]=onedimension1[i+1];
                   }
                   if (onedimension1[i]<=onedimension1[i+1]){
                       lengthtarray1[outer1][0]=onedimension1[i+1];
                   }

               }
           }


       int counteragain1 = 0;
           int [] greatestsequence1 = new int [a*b];
           for (int i = 0; i <lengthtarray1.length ; i++) {
               counteragain1 = 0;
               for (int j = 0; j <lengthtarray1[i].length-1 ; j++) {
                   if (lengthtarray1[i][j]>lengthtarray1[i][j+1]){
                       counteragain1+=1;
                   }
               }
           greatestsequence1[i]=counteragain1;
           }


           int min1= 0;
       int position1 = 0;
           for (int i = 0; i <greatestsequence1.length ; i++) {
               if (greatestsequence1[i]>min1){
                   min1=greatestsequence1[i];
                   position1=i;
               }
           }
           System.out.println("\n"+"The longest sequence where numbers are decreasing");
           if (min1!=0) {
               for (int i = 0; i <min1+1 ; i++) {
                   System.out.print(lengthtarray1[position1][i]+"  ");
               }
           }
           int[] onedimension = new int [a*b];
           int positioncounter =0;
           for (int i = 0; i <a ; i++) {
               for (int j = 0; j <b ; j++) {
                   onedimension[positioncounter] = thirdnewarray[i][j];
                   positioncounter+=1;
               }
           }
           int[][]lengthtarray = new int[a*b][a*b];
          int value = Integer.MIN_VALUE;
           for (int i = 0; i <a*b ; i++) {
               for (int j = 0; j <a*b ; j++) {
                   lengthtarray[i][j]=value;
               }
           }
           int outer = 0;
           int inner =0;
           for (int i = 0; i <a*b-1 ; i++) {
               if (onedimension[i]<onedimension[i+1]){
                   lengthtarray[outer][inner]=onedimension[i];
                   inner+=1;
               }

               if (onedimension[i]>=onedimension[i+1]) {
                   lengthtarray[outer][inner] = onedimension[i];
                   outer += 1;
                   inner = 0;
               }
                   if (i==(a*b)-2){
                   if(onedimension[i]<onedimension[i+1]){
                       lengthtarray[outer][inner]=onedimension[i+1];
                   }
               if (onedimension[i]>=onedimension[i+1]){
                   lengthtarray[outer][0]=onedimension[i+1];
               }

                   }


           }




           int counteragain = 0;
           int [] greatestsequence = new int [a*b];
           for (int i = 0; i <lengthtarray.length ; i++) {
               counteragain = 0;
               for (int j = 0; j <lengthtarray[i].length-1 ; j++) {
                   if (lengthtarray[i][j]<lengthtarray[i][j+1]){
                       counteragain+=1;
                   }
               }
               greatestsequence[i]=counteragain;
           }


           int min= 0;
           int position = 0;
           for (int i = 0; i <greatestsequence.length ; i++) {
               if (greatestsequence[i]>min){
                   min=greatestsequence[i];
                   position=i;
               }
           }


           System.out.println("\n"+"The longest sequence where numbers are increasing");
           if (min!=0) {
               for (int i = 0; i <min+1 ; i++) {
                   System.out.print(lengthtarray[position][i]+"  ");
               }
           }

           boolean[] istherewhtweneed = new boolean[a];

           for (int i = 0; i <thirdnewarray.length ; i++) {
               int trueorfalse=0;
               for (int j = 0; j <thirdnewarray[i].length ; j++) {
                   if(thirdnewarray[i][j]==0){
                       trueorfalse+=1;
                   }
               }
           if (trueorfalse==thirdnewarray[i].length){
               istherewhtweneed[i]=true;
           }
           }
int howmanyfalse = 0;
           for (int i = 0; i <istherewhtweneed.length ; i++) {
               if (!istherewhtweneed[i]){
                   howmanyfalse+=1;
               }
           }
     int [] [] withot0inrows = new int[howmanyfalse][b];
           int position2 = 0;

           for (int i = 0; i <a ; i++) {
               if (!istherewhtweneed[i]) {
                   for (int j = 0; j < b; j++) {
withot0inrows[position2][j]=thirdnewarray[i][j];
                   }
                   position2 +=1;
               }
               }
           System.out.println("\n"+"Matrix with removed empty rows");
               for (int i = 0; i <withot0inrows.length ; i++) {
               for (int j = 0; j <withot0inrows[i].length ; j++) {
                   System.out.print(withot0inrows[i][j]+"  ");
               }
               System.out.println();
           }
      boolean[] againtrue = new boolean[b];

               for (int i = 0; i <b ; i++) {
                   int countit =0;
               for (int j = 0; j <a ; j++) {
                   if (thirdnewarray[j][i]==0){
countit+=1;
                   }
               }
           if (countit==a){
               againtrue[i]=true;
           }
               }
           int howmanytrue1 =0;
               for (int i = 0; i <againtrue.length ; i++) {
               if(!againtrue[i]){
                   howmanytrue1+=1;
               }
           }

           int[][]donearray = new int[howmanyfalse][howmanytrue1];
           int additonal=0;
           for (int i = 0; i <b ; i++) {
             if(!againtrue[i]){
                 for (int j = 0; j <withot0inrows.length ; j++) {
                     donearray[j][additonal]=withot0inrows[j][i];
                 }
             additonal+=1;
             }
           }
           System.out.println("\n"+"Matrix with removed empty columns");
           for (int i = 0; i <donearray.length ; i++) {
               for (int j = 0; j <donearray[i].length ; j++) {
                   System.out.print(donearray[i][j]+"  ");
               }
               System.out.println();
           }

       }


    catch (Exception e){
        System.out.println("Wrong format." + "  "+e );
    }



    }

}
