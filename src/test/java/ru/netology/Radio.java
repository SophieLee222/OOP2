package ru.netology;

public class Radio {
    private int currentStation;
    private int maxStation;

    private int currentVolume;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsNumber) {
        this.maxStation = stationsNumber - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return newCurrentStation;
        }
        if (newCurrentStation > maxStation) {
            return newCurrentStation;
        }
        this.currentStation = newCurrentStation;
        return newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
    }
}