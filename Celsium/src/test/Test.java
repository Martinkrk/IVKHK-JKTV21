/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author pupil
 */

import java.util.Scanner;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input, unit;
        double num, result;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a number and the unit of temperature(C or F)");
        input = scn.nextLine();
        
        unit = input.substring(input.length()-1, input.length());
        num =  Double.parseDouble(input.substring(0, input.length() - 1));
        
        if("F".equals(unit)){
            result = (num - 32) * 5 / 9;
        }else if("C".equals(unit)){
            result = num * 9 / 5 + 32;
        }else {
            result = 0;
        }
        System.out.print(result);
    }
    
}
