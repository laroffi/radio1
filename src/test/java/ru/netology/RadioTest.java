package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSwitchNextStation() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentStation());
        Radio.nextStation();
        assertEquals(1, Radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchPrevStation() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentStation());
        Radio.prevStation();
        assertEquals(9, Radio.getCurrentStation());
    }
    @Test
    public void shouldSetStation() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentStation());
        Radio.setCurrentStation(8);
        assertEquals(8, Radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchPlusVolume() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentVolume());
        Radio.plusVolume();
        assertEquals(1, Radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchMinusVolume() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentVolume());
        Radio.getCurrentVolume();
        assertEquals(0, Radio.getCurrentVolume());
    }

}