package org.tw.twlibraryapp;

public class BookMetaData
{
    private String author;
    private String title;
    private String subtitle;
    private String year;
    private String isbn;
    private int hc;

    public BookMetaData(String author, String title, String subtitle, String year, String isbn) {
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

    public boolean equals(Object obj)
    {
        if(obj instanceof BookMetaData)
        {
            BookMetaData otherBookMetaData = (BookMetaData)obj;
            return author.equals(otherBookMetaData.getAuthor()) && title.equals(otherBookMetaData.getTitle()) && subtitle.equals(otherBookMetaData.getSubtitle())
                    && year.equals(otherBookMetaData.getYear()) && isbn.equals(otherBookMetaData.getIsbn());
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        if(hc == 0)
        {
            hc = author.hashCode();
            hc = hc * 31 + title.hashCode();
            hc = hc * 31 + subtitle.hashCode();
            hc = hc * 31 + year.hashCode();
            hc = hc * 31 + isbn.hashCode();
        }
        return hc;
    }

}
