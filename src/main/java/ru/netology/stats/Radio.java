package ru.netology.stats;

public class Radio {
    public int maxStation = 9;
    public int minStation = 0;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int volume;
    public int numberOfTheStation;
    public Radio(int maxStation , int minStation , int maxVolume , int minVolume){
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }
    public int getNumberOfTheStation() {
        return numberOfTheStation;
    }
    public int getMaxStation(){
        return maxStation;
    }
    public int getMinStation(){
        return minStation;
    }

    public int getVolume() {
        return volume;
    }
    public  int getMaxVolume(){
        return maxVolume;
    }
    public int getMinVolume(){
        return minVolume;
    }

    public void next() {
        if (numberOfTheStation == maxStation) {
            numberOfTheStation = minStation;
        } else {
            numberOfTheStation = numberOfTheStation + 1;
        }
    }

    public void prev() {
        if (numberOfTheStation == minStation) {
            numberOfTheStation = maxStation;
        } else {
            numberOfTheStation = numberOfTheStation - 1;
        }
    }

    public void setNumberOfTheStation(int currentStation) {
        if (currentStation <= maxStation && currentStation >= minStation) {
            numberOfTheStation = currentStation;
        }
    }

    public void setVolume(int currentVolume) {
        if (currentVolume >= minVolume && currentVolume <= maxVolume) {
            volume = currentVolume;
        }
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}


