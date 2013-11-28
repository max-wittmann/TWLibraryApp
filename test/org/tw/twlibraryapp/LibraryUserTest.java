package org.tw.twlibraryapp;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: mwittman
 * Date: 28/11/13
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryUserTest {

    @Test
    public void shouldUserHaveNameAndId() {
        LibraryUser libraryUser = new LibraryUser("Peter", "Smith", "323232");
        assertThat(libraryUser.getFirstName(), is("Peter"));
        assertThat(libraryUser.getLastName(), is("Smith"));
        assertThat(libraryUser.getId(), is("323232"));
    }

}
