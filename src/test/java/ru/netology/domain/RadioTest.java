package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //   1/1
    @Test
    public void getCurrentStation() {
        Radio rd = new Radio();
        rd.setCurrentStation(9);
        int expected = 9;
        int actual = rd.getCurrentStation();

        assertEquals(expected, actual);

    }

    //    1/2
    @Test
    public void setCurrentStation2() {
        Radio rd = new Radio();
        rd.setCurrentStation(-1);
        int expected = 0;
        int actual = rd.getCurrentStation();

        assertEquals(expected, actual);

    }

    //    1/3
    @Test
    public void setCurrentStation3() {
        Radio rd = new Radio();
        rd.setCurrentStation(10);
        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);

    }

    //    2/1
    @Test
    public void setNextStation1() {
        Radio rd = new Radio();
        rd.setCurrentStation(9);

        rd.setNextStation();

        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    //   2/2
    @Test
    public void setNextStation2() {
        Radio rd = new Radio();
        rd.setCurrentStation(0);

        rd.setNextStation();
        int expected = 1;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    //    3/1
    @Test
    public void setPrevStation1() {
        Radio rd = new Radio();
        rd.setCurrentStation(0);

        rd.setPrevStation();
        int expected = 9;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    //    3/2
    @Test
    public void setPrevStation2() {
        Radio rd = new Radio();
        rd.setCurrentStation(9);

        rd.setPrevStation();
        int expected = 8;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }


    //    4/1   - увеличение станции в диапазоне
    @Test
    public void setPlusStation1() {
        Radio rd = new Radio();
        rd.setCurrentStation(9);

        rd.setPlusStation();
        int expected = 10;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    //    4/2   - увеличение станции в диапазоне
    @Test
    public void setPlusStation2() {
        Radio rd = new Radio();
        rd.setCurrentStation(10);

        rd.setPlusStation();
        int expected = 10;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    //   5/1   уменьшение станции в диапазоне
    @Test
    public void setMinusStation1() {
        Radio rd = new Radio();
        rd.setCurrentStation(8);

        rd.setMinusStation();
        int expected = 7;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

    //   5/2   уменьшение станции в диапазоне
    @Test
    public void setMinusStation2() {
        Radio rd = new Radio();
        rd.setCurrentStation(0);

        rd.setMinusStation();
        int expected = 0;
        int actual = rd.getCurrentStation();
        assertEquals(expected, actual);
    }

}