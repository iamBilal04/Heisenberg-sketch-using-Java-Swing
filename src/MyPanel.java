import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel(){
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        //For Face Shape
        int xValues[] = {50, 65, 100, 110, 120, 125};
        int yValues[] = {30, 100, 105, 105, 80, 35};
        g2D.setColor(Color.BLACK);
        g2D.setStroke(new BasicStroke(3));
        g2D.drawPolyline(xValues, yValues, 6);

        //For Left Goggles
        g2D.fillArc(50, 30, 30, 40, 180, 180);
        g2D.setStroke(new BasicStroke(2));
        g2D.drawLine(50, 50, 80, 50);

        //For Right Goggles
        g2D.fillArc(95, 30, 30, 40, 180, 180);
        g2D.drawLine(95, 50, 80, 50);
        g2D.drawLine(95, 50, 125, 50);   //For goggle middle line

        //For Left Nose
        int nose1Values[] = {80, 80, 75, 80};
        int nose2Values[] = {50, 75, 80, 85};
        g2D.drawPolyline(nose1Values, nose2Values, 4);

        //For Right Nose
        int nose3Values[] = {95, 95, 100, 95};
        int nose4Values[] = {50, 75, 80, 85};
        g2D.drawPolyline(nose3Values, nose4Values, 4);

        //For Moustache
        g2D.setStroke(new BasicStroke(4));
        int moustache_X_Values[] = {70, 75, 100, 105};
        int mostache_Y_Values[] = {90, 86, 86, 90};
        g2D.drawPolyline(moustache_X_Values, mostache_Y_Values, 4);

        //For lips
        g2D.setStroke(new BasicStroke(2));
        g2D.drawLine(78, 94, 98, 94);

        //For Hat
        int hat_X_Values[] = {40, 130, 129, 120, 117, 50, 50, 45};
        int hat_Y_Values[] = {40, 40, 33, 32, 5, 5, 32, 32};
        g2D.setStroke(new BasicStroke(5));
        g2D.fillPolygon(hat_X_Values, hat_Y_Values, 8);

        //For name
        g2D.setFont(new Font("Elephant", Font.PLAIN, 25));
        g2D.drawString("He  isenberg", 60, 140);

        //For Square
        g2D.setStroke(new BasicStroke(2));
        g2D.drawRect(55, 110, 50, 50);

    }
}
