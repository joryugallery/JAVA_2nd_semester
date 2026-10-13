package ai1013;

import center.CenterFrame2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FlowLayoutTest extends JFrame {
    public FlowLayoutTest() {
        setTitle("FlowLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.RIGHT, 15, 15));

        ArrayList<JButton> list = new ArrayList<JButton>(5);
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN};

        for (int i =0; i < 5;i++) {
            JButton btn = new JButton("버튼"+(i+1));
            Color color = colors[i];
            btn.addActionListener(e -> getContentPane().setBackground(color));
            list.add(btn);
            add(btn);
        }

        int w =250, h=250;
        Point point = CenterFrame2.getLocation(w,h);
        setBounds(point.x,point.y,w,h);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}
