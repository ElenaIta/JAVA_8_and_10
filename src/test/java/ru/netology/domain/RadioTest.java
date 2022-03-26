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

    //    4/1 - диапазон звука
    @Test
    public void setCurrentVolume1() {
        Radio rd = new Radio();
        rd.setCurrentVolume(9);
        int expected = 9;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //    4/2
    @Test
    public void setCurrentVolume2() {
        Radio rd = new Radio();
        rd.setCurrentVolume(-1);
        int expected = 0;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //  4/3
    @Test
    public void setCurrentVolume3() {
        Radio rd = new Radio();
        rd.setCurrentVolume(11);
        int expected = 10;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //    5/1   - увеличение звука
    @Test
    public void setPlusVolume1() {
        Radio rd = new Radio();
        rd.setCurrentVolume(9);

        rd.setPlusVolume();
        int expected = 10;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //    5/2   - увеличение звука
    @Test
    public void setPlusVolume2() {
        Radio rd = new Radio();
        rd.setCurrentVolume(10);

        rd.setPlusVolume();
        int expected = 10;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //   6/1   уменьшение звука
    @Test
    public void setMinusVolume1() {
        Radio rd = new Radio();
        rd.setCurrentVolume(8);

        rd.setMinusVolume();
        int expected = 7;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //   6/2   уменьшение звука
    @Test
    public void setMinusVolume2() {
        Radio rd = new Radio();
        rd.setCurrentVolume(0);

        rd.setMinusVolume();
        int expected = 0;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }


    //   7/1   максимальный звук
    @Test
    public void setStopMaxVolume1() {
        Radio rd = new Radio();
        rd.setCurrentVolume(8);

        rd.setStopMaxVolume();
        int expected = 8;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //   7/2   максимальный звук
    @Test
    public void setStopMaxVolume2() {
        Radio rd = new Radio();
        rd.setCurrentVolume(11);

        rd.setStopMaxVolume();
        int expected = 10;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //   8/1
    @Test
    public void setStopMinVolume1() {
        Radio rd = new Radio();
        rd.setCurrentVolume(-1);

        rd.setStopMinVolume();
        int expected = 0;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //   8/2 - тест не проходит
    @Test
    public void setStopMinVolume2() {
        Radio rd = new Radio();
        rd.setCurrentVolume(1);

        rd.setStopMinVolume();
        int expected = 1;
        int actual = rd.getCurrentVolume();
        assertEquals(expected, actual);
    }
}