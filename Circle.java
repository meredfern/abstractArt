import java.awt.Color;
import gpdraw.*;
public class Circle
{
    private double radius;
    private boolean fill;
    private Color color;
    // pre: 
    // post:
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius, boolean fill)
    {
        this.radius=radius;
        this.fill=true;
    }
    public void draw(DrawingTool pen)
    {
        if(fill==true)
        {
            pen.setColor(this.color);
            pen.fillCircle(radius);
        }
        pen.setColor(this.color);
        pen.drawCircle(radius);
    }
}