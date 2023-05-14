import javax.swing.*;
public class DrawingTester
 {
    public static void main(String[] args) throws Exception {
        DrawingCanvas dc = new DrawingCanvas(500,500);
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setTitle("draw");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
