package org.tw.twlibraryapp;

/**
 * Created with IntelliJ IDEA.
 * User: mwittman
 * Date: 28/11/13
 * Time: 4:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookMetaDataBuilder {
    String bookTitle = "Title";
    String bookSubTitle = "SubTitle";
    String bookAuthor = "Author";
    String bookYear = "Year";
    String bookISBN = "ISBN";

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookSubTitle(String bookSubTitle) {
        this.bookSubTitle = bookSubTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public BookMetaData buildBook()
    {
        return new BookMetaData(bookAuthor, bookTitle, bookSubTitle, bookYear, bookISBN);
    }
}
