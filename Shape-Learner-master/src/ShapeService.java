
import models.Shape;
import models.ShapeDTO;

import java.awt.*;
import java.awt.geom.Path2D;


class Square implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }
}
class Rectangle implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.fillRect(x, y, width, height);
    }
}

class Circle implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.fillOval(x, y, width, height);
    }
}

class Triangle implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int[] xPoints = {x, x + width / 2, x + width};
        int[] yPoints = {y + height, y, y + height};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}










