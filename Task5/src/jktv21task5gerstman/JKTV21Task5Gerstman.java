package jktv21task5gerstman;


import java.util.Random;
public class JKTV21Task5Gerstman {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] jagged = new int[5][];
//        int[] all = new int[32];

        jagged[0] = new int[3];
        jagged[1] = new int[5];
        jagged[2] = new int[7];
        jagged[3] = new int[8];
        jagged[4] = new int[9];

        System.out.println("Unsorted: ");
        for(int i = 0; i < jagged.length; i++){
            for(int j = 0; j < jagged[i].length; j++){
                jagged[i][j] = rnd.nextInt(100 - 50 + 1) + 50;
                System.out.printf(jagged[i][j] + " ");
            }
            System.out.println();
        }

        //Sorting: The simple way

//        int counter = 0;
//        for(int i = 0; i < jagged.length; i++){
//            for(int j = 0; j < jagged[i].length; j++){
//                all[counter] = jagged[i][j];
//                counter++;
//            }
//        }
//        Arrays.sort(all);
//        counter = 0;
//
//        for(int i = 0; i < jagged.length; i++){
//            for(int j = 0; j < jagged[i].length; j++){
//                jagged[i][j] = all[counter];
//                counter++;
//            }
//        }

        //Sorting: Using two loops

        //Find num of elements
        int sum = 0;
        for(int[] arr : jagged){
            sum += arr.length;
        }
        int counter = 0;
        int subArrN;
        int eP, eN;

        for(int i = 0; i < sum - 1; i++){
            subArrN = jagged[0].length - 1;
            for(int j = 0; j < sum - 1; j++){
                eP = jagged[counter][j];
                if(j == subArrN){
                    if(counter + 1 == jagged.length){
                        counter = 0;
                        break;
                    }
                    counter += 1;
                    eN = jagged[counter][0];
                    if(eP > eN){
                        jagged[counter-1][j] = eN;
                        jagged[counter][0] = eP;
                    }
                    subArrN = jagged[counter].length - 1;
                    j = -1;
                }
                else{
                    eN = jagged[counter][j+1];
                    if(eP > eN){
                        jagged[counter][j] = eN;
                        jagged[counter][j+1] = eP;
                    }
                }
            }
        }


        
        System.out.println("\nSorted: ");
        for(int i = 0; i < jagged.length; i++){
            for(int j = 0; j < jagged[i].length; j++){
                System.out.printf(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }  
}
