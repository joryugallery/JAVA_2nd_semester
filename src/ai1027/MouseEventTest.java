package ai1027;

import center.SetFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest extends JFrame {
    JLabel lbl = new JLabel();
    public MouseEventTest() {
        JPanel panel = new JPanel();
        JButton btn = new JButton();

        panel.add(btn);
        add(panel);
        add("South",lbl);

        btn.addMouseListener(btnMouseListener);

        SetFrame.setFrame(this, "MouseEvent Programming", 300, 300);
    }

    MouseListener btnMouseListener = new MouseListener() {


        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("마우스 클릭됨");
            lbl.setText("마우스 클릭됨");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            int eBtn = e.getButton();
            String msg = "";
            switch (eBtn) {
                case MouseEvent.BUTTON1:

            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("마우스 해제됨");
            lbl.setText("마우스 해제됨");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("마우스 들어옴");
            lbl.setText("마우스 들어옴");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("마우스 나감");
            lbl.setText("마우스 나감");
        }

    };


    public static void main(String[] args) {

    }
}
