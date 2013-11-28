package org.tw.twlibraryapp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookMetaDataTest {

    @Test
    public void shouldBookHaveDetails()
    {
        BookMetaData bookMetaData = new BookMetaData("Author", "Title", "Subtitle", "Year", "ISBN");
        assertThat(bookMetaData.getAuthor(), is("Author"));
        assertThat(bookMetaData.getTitle(), is("Title"));
        assertThat(bookMetaData.getSubtitle(), is("Subtitle"));
        assertThat(bookMetaData.getYear(), is("Year"));
        assertThat(bookMetaData.getIsbn(), is("ISBN"));
    }

    @Test
    public void shouldBookEqualBookWithSameData()
    {
        BookMetaData bookMetaData1 = new BookMetaData("Author", "Title", "Subtitle", "Year", "ISBN");
        BookMetaData bookMetaData2 = new BookMetaData("Author", "Title", "Subtitle", "Year", "ISBN");
        assertThat(bookMetaData1.equals(bookMetaData2), is(true));
    }

    @Test
    public void shouldNotBookEqualBookWithDifferentData()
    {
        BookMetaData bookMetaData1 = new BookMetaData("Author1", "Title", "Subtitle", "Year", "ISBN");
        BookMetaData bookMetaData2 = new BookMetaData("Author2", "Title", "Subtitle", "Year", "ISBN");
        assertThat(bookMetaData1.equals(bookMetaData2), is(false));

        bookMetaData1 = new BookMetaData("Author", "Title1", "Subtitle", "Year", "ISBN");
        bookMetaData2 = new BookMetaData("Author", "Title2", "Subtitle", "Year", "ISBN");
        assertThat(bookMetaData1.equals(bookMetaData2), is(false));

        bookMetaData1 = new BookMetaData("Author", "Title", "Subtitle1", "Year", "ISBN");
        bookMetaData2 = new BookMetaData("Author", "Title", "Subtitle2", "Year", "ISBN");
        assertThat(bookMetaData1.equals(bookMetaData2), is(false));

        bookMetaData1 = new BookMetaData("Author", "Title", "Subtitle", "Year1", "ISBN");
        bookMetaData2 = new BookMetaData("Author", "Title", "Subtitle", "Year2", "ISBN");
        assertThat(bookMetaData1.equals(bookMetaData2), is(false));

        bookMetaData1 = new BookMetaData("Author", "Title", "Subtitle", "Year", "ISBN1");
        bookMetaData2 = new BookMetaData("Author", "Title", "Subtitle", "Year", "ISBN2");
        assertThat(bookMetaData1.equals(bookMetaData2), is(false));
    }

    @Test
    public void shouldBookHaveSameHashCodeAsBookWithSameData()
    {
        BookMetaData bookMetaData1 = new BookMetaData("Author", "Title", "Subtitle", "Year", "ISBN");
        BookMetaData bookMetaData2 = new BookMetaData("Author", "Title", "Subtitle", "Year", "ISBN");
        assertThat(bookMetaData1.hashCode() == bookMetaData2.hashCode(), is(true));
    }

}
