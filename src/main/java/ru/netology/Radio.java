package ru.netology;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
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
        if (currentStation < 9) {
        currentStation = currentStation + 1;
    }
        else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
        currentStation = currentStation - 1;
    }
        else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        else {
            currentVolume = currentVolume;
        }
    }
}
