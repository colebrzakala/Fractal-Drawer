
import java.util.Scanner;
import java.awt.Color;
import java.util.Random;

public class FractalDrawer {
    private double totalArea=0;
    public FractalDrawer() {}
    public double drawFractal(String type) {
        Canvas fraccanvas = new Canvas(800,800);
        if (type.equals("triangle")) {
            drawTriangleFractal(200,200,300,300,Color.CYAN,fraccanvas,0);
        }
        if (type.equals("circle")) {
            drawCircleFractal(100,400,400,Color.CYAN,fraccanvas,0);
        }
        if (type.equals("rectangle")) {
            drawRectangleFractal(200,100,300,300,Color.CYAN,fraccanvas,0);
        }
        return totalArea;
    }
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Triangle newtri = new Triangle(x,y,width,height);
        newtri.setColor(c);
        double scale = 2;
        if (level > 8)
            ;
        else {
            can.drawShape(newtri);
            totalArea = totalArea + newtri.calculateArea();
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color color = new Color(r,g,b);
            drawTriangleFractal((width/scale),(height/scale),x+(width/4),y+(height/2),color,can,level+1);
            drawTriangleFractal((width/scale),(height/scale),x+(0.75*width),y-(height/2),color,can,level+1);
            drawTriangleFractal((width/scale),(height/scale),x-(0.25*width),y-(height/2),color,can,level+1);
        }
    }
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle newcir = new Circle(x, y, radius);
        newcir.setColor(c);
        double scale = 2;
        if (level > 8)
            ;
        else {
            can.drawShape(newcir);
            totalArea = totalArea + newcir.calculateArea();
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color color = new Color(r, g, b);
            drawCircleFractal(radius / scale, x + (1.05*radius), y + (1.05*radius), color, can, level + 1);
            drawCircleFractal(radius / scale, x - (1.05*radius), y + (1.05*radius), color, can, level + 1);
            drawCircleFractal(radius / scale, x + (1.05*radius), y - (1.05*radius), color, can, level + 1);
            drawCircleFractal(radius / scale, x - (1.05*radius), y - (1.05*radius), color, can, level + 1);
        }
    }
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
            Rectangle newrect = new Rectangle(x,y,height,width);
            newrect.setColor(c);
            double scale = 2;
            if (level > 8)
                ;
            else {
                can.drawShape(newrect);
                totalArea = totalArea + newrect.calculateArea();
                Random rand = new Random();
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color color = new Color(r, g, b);
                drawRectangleFractal(width / scale, height / scale, x + width, y + height, color, can, level + 1);
                drawRectangleFractal(width / scale, height / scale, x - (0.5*width), y + height, color, can, level + 1);
                drawRectangleFractal(width / scale, height / scale, x + width, y - (0.5*height), color, can, level + 1);
                drawRectangleFractal(width / scale, height / scale, x - (0.5*width), y - (0.5*height), color, can, level + 1);
            }
        }
    public static void main(String[] args) {
        System.out.println("--Fractal Drawer--");
        System.out.println("Options:");
        System.out.println("circle - draws a fractal made up of circles");
        System.out.println("triangle - draws a fractal made up of triangles");
        System.out.println("rectangle - draws a fractal made up of rectangles");
        System.out.println("Enter choice to get started: ");
        Scanner myScanner = new Scanner(System.in);
        String choice = myScanner.nextLine();
        FractalDrawer f1 = new FractalDrawer();
        System.out.println("Total Area: "+f1.drawFractal(choice));
    }
}