package booksauthors;

import java.util.Arrays;
import myclasses.Book;
import tools.Tools;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        Book[] books = new Book[5];
        Tools tool = new Tools();
        
        System.out.println("Create 5 books!");
        for(int i=0; i < 5;i++){
            books[i] = tool.createBook(i);
        }
        System.out.println(Arrays.toString(books).replace("[", "").replace("]", ""));
    }
}
