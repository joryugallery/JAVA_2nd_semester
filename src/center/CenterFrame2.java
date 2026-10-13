package center;

import javax.swing.*;
import java.awt.*;

public class CenterFrame2 extends JFrame {
    public static Point getLocation(int w, int h){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        toolkit.getScreenSize();
        Dimension dimension = toolkit.getScreenSize();



        int sw = dimension.width;
        int sh = dimension.height;



        int x = sw / 2 - w / 2;
        int y = sh / 2 - h / 2;

        Point point = new Point(x, y);

//        Dimension locationDim = new Dimension(x,y);
        return point;

    }
}
