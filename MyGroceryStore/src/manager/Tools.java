package manager;

import java.util.Scanner;

public class Tools {
    
    Scanner scn = new Scanner(System.in);
    
    //Did user input an int
    public Integer inputInt(int[] range){
        int input;
        do{
            try{
                input = scn.nextInt();
            }
            catch (java.util.InputMismatchException e){
                System.err.println("Wrong input! Use integers!");
                continue;
            }
            catch (Exception e){
                System.err.println(e);
                continue;
            }
            finally {
                scn.nextLine();
            }
                if(input < range[0] || input > range[1]){
                    System.out.println("Wrong range!");
                    continue;
                }
                else{
                    break;
                }
        }while(true);
        
        return input;
    }

    public Double inputDouble(double[] range){
        Double input;
        do{
            try{
                input = scn.nextDouble();
            }
            catch (java.util.InputMismatchException e){
                System.err.println("Wrong input! Use Doubles!");
                continue;
            }
            catch (Exception e){
                System.err.println(e);
                continue;
            }
            finally {
                scn.nextLine();
            }
                if(input < range[0] || input > range[1]){
                    System.out.println("Wrong range!");
                    continue;
                }
                else{
                    break;
                }
        }while(true);
        
        return input;
    }
}
