import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class DrawingCanvas extends JComponent{
    private int width;
    private int height;


    public DrawingCanvas(int w, int h) {
        width = w;
        height = h;
    }


    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
       
        Rectangle2D.Double r = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(new Color(130,130,130));
        g2d.fill(r);
       
        Ellipse2D.Double e = new Ellipse2D.Double(250, 250, 50, 50);
        g2d.setColor(Color.BLACK);
        g2d.fill(e);
    }
   
}


