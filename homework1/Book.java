package org.example.homework1;

public class Book implements Displayable {
    private String bookName;
    private String author;
    private int year;

    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void display() {
        System.out.println(this.bookName);
        System.out.println(this.author);
        System.out.println(this.year);
    }
}
