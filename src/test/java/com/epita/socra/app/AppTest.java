package com.epita.socra.app;

import org.junit.Test;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

public class AppTest {
    @Test
    public void i_to_r_test1() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(1);
        mock.write(str);
        verify(mock).write("I");
    }

    @Test
    public void i_to_r_test10() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(10);
        mock.write(str);
        verify(mock).write("X");
    }

    @Test
    public void i_to_r_test100() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(100);
        mock.write(str);
        verify(mock).write("C");
    }

    @Test
    public void i_to_r_test1000() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(1000);
        mock.write(str);
        verify(mock).write("M");
    }

    @Test
    public void i_to_r_test9() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(9);
        mock.write(str);
        verify(mock).write("IX");
    }

    @Test
    public void i_to_r_test99() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(99);
        mock.write(str);
        verify(mock).write("XCIX");
    }

    @Test
    public void i_to_r_test999() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(999);
        mock.write(str);
        verify(mock).write("CMXCIX");
    }

    @Test
    public void i_to_r_test3000() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(3000);
        mock.write(str);
        verify(mock).write("MMM");
    }

    @Test
    public void i_to_r_test24() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(24);
        mock.write(str);
        verify(mock).write("XXIV");
    }

    @Test
    public void i_to_r_test358() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(358);
        mock.write(str);
        verify(mock).write("CCCLVIII");
    }

    @Test
    public void i_to_r_test1574() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Int_to_roman number = new Int_to_roman();
        String str = number.int_to_roman(1574);
        mock.write(str);
        verify(mock).write("MDLXXIV");
    }

    // ---------- Roman to int tests -------------
    @Test
    public void r_to_i_test1() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("I");
        mock.write(str);
        verify(mock).write("1");
    }

    @Test
    public void r_to_i_test10() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("X");
        mock.write(str);
        verify(mock).write("10");
    }

    @Test
    public void r_to_i_test100() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("C");
        mock.write(str);
        verify(mock).write("100");
    }

    @Test
    public void r_to_i_test1000() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("M");
        mock.write(str);
        verify(mock).write("1000");
    }

    @Test
    public void r_to_i_test9() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("IX");
        mock.write(str);
        verify(mock).write("9");
    }

    @Test
    public void r_to_i_test99() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("XCIX");
        mock.write(str);
        verify(mock).write("99");
    }

    @Test
    public void r_to_i_test999() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("CMXCIX");
        mock.write(str);
        verify(mock).write("999");
    }

    @Test
    public void r_to_i_test3000() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("MMM");
        mock.write(str);
        verify(mock).write("3000");
    }

    @Test
    public void r_to_i_test24() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("XXIV");
        mock.write(str);
        verify(mock).write("24");
    }

    @Test
    public void r_to_i_test358() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("CCCLVIII");
        mock.write(str);
        verify(mock).write("358");
    }

    @Test
    public void r_to_i_test1574() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("TEST");
        Roman_to_int number = new Roman_to_int();
        String str = number.roman_to_int("MDLXXIV");
        mock.write(str);
        verify(mock).write("1574");
    }
}
