
import java.awt.*;

public class Circle {
    double xpos;
    double ypos;
    double rad;
    Color circlecolor;

    public Circle(double xposition, double yposition, double radius) {
        xpos = xposition;
        ypos = yposition;
        rad = radius;
        circlecolor = Color.WHITE;
    }

    public double calculatePerimeter() {
        double perim = (2 * (Math.PI) * rad);
        return perim;
    }

    public double calculateArea() {
        double Area = (Math.pow(getRadius(), 2)) * Math.PI;
        return Area;
    }

    public void setColor(Color color) {
        circlecolor = color;
    }

    public void setPos(double x, double y) {
        xpos = x;
        ypos = y;
    }

    public void setRadius(double radius) {
        rad = radius;
    }

    public Color getColor() {
        return circlecolor;
    }

    public double getXPos() {
        return xpos;
    }

    public double getYPos() {
        return ypos;
    }

    public double getRadius() {
        return rad;
    }
}

