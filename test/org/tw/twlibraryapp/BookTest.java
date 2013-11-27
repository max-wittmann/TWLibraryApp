package org.tw.twlibraryapp;

import org.junit.Test;
import org.tw.twlibraryapp.Book;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    @Test
    public void shouldBookHaveDetails()
    {
        Book book = new Book("Author", "Title", "Subtitle", "Year", "ISBN");
        assertThat(book.getAuthor(), is("Author"));
        assertThat(book.getTitle(), is("Title"));
        assertThat(book.getSubtitle(), is("Subtitle"));
        assertThat(book.getYear(), is("Year"));
        assertThat(book.getIsbn(), is("ISBN"));
    }


}
