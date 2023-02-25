/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task4gerstman;


import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author pupil
 */
public class JKTV21Task4Gerstman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        int[] arr = new int[100];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(50) * 2 + 1;
            sum = sum + arr[i];
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            if(i % 10 == 0){
                System.out.printf("\n%d\t", arr[i]);
            }
            else{
                System.out.printf("%d\t", arr[i]);
            }
        }
        
        System.out.println("\nAverage: " + sum / arr.length);
    }
}