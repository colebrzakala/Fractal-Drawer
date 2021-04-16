
import java.awt.*;

public class Triangle {
    double xpos;
    double ypos;
    double triwidth;
    double triheight;
    Color tricolor;
    double a;
    double b;

    public Triangle(double xposition, double yposition, double width, double height) {
        xpos = xposition;
        ypos = yposition;
        triwidth = width;
        triheight = height;
        tricolor = Color.WHITE;
        a = triwidth;
        b = Math.hypot((a / 2), triheight);
    }

    public double calculatePerimeter() {
        double perim = (a + (2 * b));
        return perim;
    }

    public double calculateArea() {
        double area = (0.5 * triwidth * triheight);
        return area;
    }

    public void setColor(Color color) {
        tricolor = color;
    }

    public void setPos(double xposition, double yposition) {
        xpos = xposition;
        ypos = yposition;
    }

    public void setHeight(double height) {
        triheight = height;
    }

    public void setWidth(double width) {
        triwidth = width;
    }

    public Color getColor() {
        return tricolor;
    }

    public double getXPos() {
        return xpos;
    }

    public double getYPos() {
        return ypos;
    }

    public double getHeight() {
        return triheight;
    }

    public double getWidth() {
        return triwidth;
    }
}