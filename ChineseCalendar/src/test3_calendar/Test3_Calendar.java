/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3_calendar;

import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class Test3_Calendar {

    static enum Colors{
        Green, Red, Yellow, White, Black
    }
    static enum Animals{
        Rat, Ox, Tiger, Rabbit, Dragon, Snake, Horse, Sheep, Monkey, Rooster, Dog, Boar
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        for(Colors color : Colors.values()){
//            for(Animals animal : Animals.values())
//                Sys
//        }
//    }
        Scanner scn = new Scanner(System.in);
        int year = 2022;
        int diff, cycle, subCycle; 
        System.out.println("Enter a year");
        do {
            try{
                year = scn.nextInt();
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            scn.nextLine();
            
            if(year > 0){
                break;
            }
            else{
                System.out.println("Incorrect input! Negative year");
            }
        }while(true);
        
        int cl = 0, al = 0;
    
        diff = Math.abs(1984 - year);
        if(year < 1984){
            cl = Colors.values().length -1;
            al = Animals.values().length -1;
        }
        cycle = (diff / 12) % 5;
        subCycle = diff % 12;
        System.out.println("The year is: " + Colors.values()[Math.abs(cl - cycle)] + " " +  Animals.values()[Math.abs(al - subCycle)]);
    }
}
