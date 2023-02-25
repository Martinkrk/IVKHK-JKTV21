/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringedit;

import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class StringEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----strings in Java----");
        System.out.println("Enter a string");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String subStr, replaceStr;
        int index;
        
        OUTER:
        do {
            System.out.println("Choose function number:");
            System.out.println("0. Exit the programm");
            System.out.println("1. Output the amount of symbols");
            System.out.println("2. Output the amount of words");
            System.out.println("3. Find a word in a string");
            System.out.println("4. Replace the given word in a string");
            int number = scn.nextInt();
            scn.nextLine();
            switch (number) {
                case 0:
                    break OUTER;
                case 1:
                    System.out.println("You chose " + number);
                    int symbol_num = 0;
                    String uppered = str.toUpperCase();
                    for(int j = 0; j < str.length(); j++){
                        for(char i = 'A'; i <= 'Z'; i++){
                            if(uppered.substring(j,j+1).equals(i+"")) symbol_num++;
                    }
                        }
                  
                    System.out.println("The amount of symbols is:" + symbol_num);
                    break;
                case 2:
                    System.out.println("You chose " + number);
                    String[] words = str.split(" ");
                    System.out.println("The amount of words is " + words.length);
                    break;
                case 3:
                    System.out.println("You chose " + number);
                    System.err.println("Enter a word to find: ");
                    subStr = scn.nextLine();
                    index = str.indexOf(subStr);
                    if(index < 0){
                        System.out.println("There is no such word!");
                    }
                    else{
                        System.out.println("Your word is at index: " + index);
                    }
                    break;
                case 4:
                    System.out.println("You chose " + number);
                    System.out.println("Enter a word to replace: ");
                    subStr = scn.nextLine();
                    index = str.indexOf(subStr);
                    if(index < 0){
                        System.err.println("There is no such word");
                    }
                    else{
                    System.out.println("Enter a word for a replacement: ");
                    replaceStr = scn.nextLine();
                        System.out.println("Corrected string: " + str.replace(subStr, replaceStr));
                    }
                    break;
                default:
                    break;
            }
        }while(true);
    }
}
