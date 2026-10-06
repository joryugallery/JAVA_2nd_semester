package center;

import java.awt.*;

public class CenterFrame {
    public static int[] getLocation(int w, int h){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        toolkit.getScreenSize();
        Dimension dimension = toolkit.getScreenSize();



        int sw = dimension.width;
        int sh = dimension.height;



        int x = sw / 2 - w / 2;
        int y = sh / 2 - h / 2;
        int[] location = {x,y};

//        Dimension locationDim = new Dimension(x,y);
        return location;

    }
}
