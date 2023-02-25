/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task2gerstman;


import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JKTV21Task2Gerstman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int input, sum = 0;
        System.out.println("Enter a number");
        
        input = scn.nextInt();
        String s = String.valueOf(input);
        for(int i = 0; i < s.length(); i++){
            sum = sum + Integer.parseInt(s.charAt(i) + "");
        }
        System.out.println(sum);
    }
    
}
