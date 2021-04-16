

import java.awt.*;

public class Rectangle {
    double xpos;
    double ypos;
    double rectwidth;
    double rectheight;
    Color rectcolor;

    public Rectangle(double xposition, double yposition, double height, double width) {
        xpos = xposition;
        ypos = yposition;
        rectwidth = width;
        rectheight = height;
        rectcolor = Color.WHITE;
    }

    public double calculatePerimeter() {
        double perim = ((2 * rectheight) + (2 * rectwidth));
        return perim;
    }

    public double calculateArea() {
        double area = (rectheight * rectwidth);
        return area;
    }

    public void setColor(Color color) {
        rectcolor = color;
    }

    public void setPos(double xposition, double yposition) {
        xpos = xposition;
        ypos = yposition;
    }

    public void setHeight(double height) {
        rectheight = height;
    }

    public void setWidth(double width) {
        rectwidth = width;
    }

    public Color getColor() {
        return rectcolor;
    }

    public double getXPos() {
        return xpos;
    }

    public double getYPos() {
        return ypos;
    }

    public double getHeight() {
        return rectheight;
    }

    public double getWidth() {
        return rectwidth;
    }
}
