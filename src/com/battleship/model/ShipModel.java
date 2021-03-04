package com.battleship.model;

import com.battleship.controller.Helper;

public class ShipModel {
    private int positionX;
    private int positionY;

    public ShipModel() {
        this.positionX = Helper.randomizePosition(7);
        this.positionY = Helper.randomizePosition(7);
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}
