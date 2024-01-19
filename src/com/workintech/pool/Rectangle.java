package com.workintech.pool;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = (width < 0) ? 0 : width;
        this.height = (height < 0) ? 0 : height;
    }
}
