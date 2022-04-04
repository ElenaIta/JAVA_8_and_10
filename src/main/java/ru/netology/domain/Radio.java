package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

    private int quantityStation = 10;

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) { this.minVolume = minVolume; }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void setQuantityStation(int quantityStation) {
        this.quantityStation = quantityStation;
    }


    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {
    }

    // 1 выставлять номер радиостанции через прямое указание её номера
    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation > 9) {
            currentStation = maxStation;
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    // 2 переключение последней станции на первую
    public void setNextStation() {
        if (currentStation == maxStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    // 3 переключение первой станции на последнюю
    public void setPrevStation() {
        if (currentStation == minStation) {
            setCurrentStation(currentStation = maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }


    //  4 диапазон звука
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            currentVolume = maxVolume;
            return;
        }
        if (newCurrentVolume < 0) {
            currentVolume = minVolume;
            return;
        }
        currentVolume = newCurrentVolume;
    }

    // 5 увеличение звука
    public void setPlusVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    // 6 уменьшение звука
    public void setMinusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    // 7 максимальный звук
    public void setStopMaxVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
    }

    // 8 минимальный звук
    public void setStopMinVolume() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        }
    }

}