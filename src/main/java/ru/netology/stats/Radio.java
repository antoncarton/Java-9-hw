package ru.netology.stats;

public class Radio {
    public int volume;
    public int numberOfTheStation;

    public int getNumberOfTheStation() {
        return numberOfTheStation;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (numberOfTheStation == 9) {
            numberOfTheStation = 0;
        } else {
            numberOfTheStation = numberOfTheStation + 1;
        }
    }

    public void prev() {
        if (numberOfTheStation == 0) {
            numberOfTheStation = 9;
        } else {
            numberOfTheStation = numberOfTheStation - 1;
        }
    }

    public void setNumberOfTheStation(int currentStation) {
        if (currentStation < 10 && currentStation >= 0) {
            numberOfTheStation = currentStation;
        }
    }

    public void setVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 10) {
            volume = currentVolume;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}


