/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Book {
    private int id;
    private String title;
    private Author[] authors = new Author[0];

    public Book() {
    }

    public Book(String title, Author[] authors, int id) {
        this.id = id;
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        String txt = "";
        for(Author a : authors){
            txt += a + ", ";
        }
        txt = txt.substring(0,txt.length()-2);
        return txt;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public void addAuthor(Author author){
        Author[] newAuthors = Arrays.copyOf(authors, authors.length+1);
        newAuthors[newAuthors.length-1] = author;
        authors = newAuthors;
        
    }

    @Override
    public String toString() {
        return "\nBook " + getId() + ": " + getTitle() + "\n" + getAuthors();
    }
        
}
