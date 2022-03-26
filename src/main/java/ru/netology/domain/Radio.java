package ru.netology.domain;

public class Radio {
    public int getCurrentStation() {
        return currentStation;
    }
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;


    public Radio() {
    }
    public Radio(int station) {
        this.maxStation = station - 1;
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
        }
    }

    // 3 переключение первой станции на последнюю
    public void setPrevStation() {
        if (currentStation == minStation) {
            setCurrentStation(currentStation = maxStation);
        }
    }


    // 4 увеличение станции в диапазоне
    public void setPlusStation() {
        if (currentStation < 10) {
            currentStation = currentStation + 1;
        }
    }

    // 5 уменьшение станции в диапазоне
    public void setMinusStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }


}
