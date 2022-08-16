package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void notShouldSetStationBelowZero() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(-1);

        int expected = 0;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationEqualZero() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(0);

        int expected = 0;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveZero() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(1);

        int expected = 1;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetStationAboveNine() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(11);

        int expected = 0;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowNine() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(8);

        int expected = 8;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNine() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(9);

        int expected = 9;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStation() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(8);
        radio.prev();

        int expected = 7;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(1);
        radio.next();

        int expected = 2;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAfterNine() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousStationBeforeZero() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setNumberOfTheStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberOfTheStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetVolumeAfterTen() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldNotSetVolumeBelowZero() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setVolume(1);

        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotIncreaseVolume() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldDecreaseVolume() {
        Radio radio = new Radio(9,0,100, 0);
        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkGetters() {
        Radio radio = new Radio(9,0,100, 0);

        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getMinVolume());
    }
    @Test
    public void checkSize(){
        Radio radio = new Radio (9);
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getNumberOfTheStation());
    }

}

