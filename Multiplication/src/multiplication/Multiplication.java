package multiplication;


import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();

        int x, y;
        int input, score = 0, answer;

        for(int i = 0; i < 5; i++) {
            x = rnd.nextInt(10) + 1;
            y = rnd.nextInt(10) + 1;
            answer = x * y;
            System.out.printf("What is %d * %d?%n", x, y);

            try{
            input = scn.nextInt();
            }
            catch (Exception e){
                System.err.println(e);
                continue;
            }
            finally {
                scn.nextLine();
            }

            if(input == answer){
                score++;
                System.out.println("\u001B[32m" + "Correct!" + "\u001B[0m");
            }
            else{
                System.out.println("\u001B[31m" + "Wrong!" + "\u001B[0m");
            }
        }
        switch (score){
            case 0:
            case 1:
            case 2:
                System.out.println("Hurry and learn the multiplication table!");
                break;
            case 3:
            case 4:
                System.out.println("Got to learn some more");
                break;
            case 5:
                System.out.println("Good job!");
                break;
        }
    }
}
