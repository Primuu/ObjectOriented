package pl.edu.uwm.obiektowe.lab07.pl.imiajd.trentowski;

import java.awt.*;

public class BetterRectangle extends java.awt.Rectangle{

    public BetterRectangle(int x, int y, int width, int height) {
//        super.setLocation(x, y);
//        super.setSize(width, height);
        super(x,y, width, height);
    }

    public double getPerimeter(){
        return this.getHeight() * 2 + this.getWidth() * 2;
    }

    public double getArea(){
        return this.getHeight() * this.getWidth();
    }
}
