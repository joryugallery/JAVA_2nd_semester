package ai1028;

import center.SetFrame;

import javax.swing.*;
import java.awt.event.*;
import java.text.BreakIterator;

public class FindLocationMouseEvent extends JFrame {
    public FindLocationMouseEvent() {
        JTextField textX, textY;
        JPanel panel = new JPanel();
        textX = new JTextField(5);
        textY = new JTextField(5);

        panel.add(textX);
        panel.add(textY);
        add("South", panel);
        addMouseListener(mouseListener);
        SetFrame.setFrame(this, "마우스 이벤트 발생 위치 출력", 500, 500);
    }

    MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            BreakIterator textX = null;
            BreakIterator textY = null;
            textX.setText(e.getX() + "");
            textY.setText(e.getY() + "");
        }
    };

    MouseMotionListener mouseMotionListener = new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {}
    };

    public static void main(String[] args) {
        new FindLocationMouseEvent();
    }
}
