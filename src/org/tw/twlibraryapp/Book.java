package org.tw.twlibraryapp;

/**
 * Created with IntelliJ IDEA.
 * User: mwittman
 * Date: 27/11/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private String author;
    private String title;
    private String subtitle;
    private String year;
    private String isbn;

    public Book(String author, String title, String subtitle, String year, String isbn) {
        this.author = author;
        this.title = title;
        this.subtitle = subtitle;
        this.year = year;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }
}
