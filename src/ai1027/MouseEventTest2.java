package ai1027;

import center.SetFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest2 extends JFrame {
    JLabel lbl = new JLabel();
    public MouseEventTest2() {
        JPanel panel = new JPanel();
        JButton btn = new JButton("red");
        JButton btn2 = new JButton("green");
        JButton btn3 = new JButton("blue");
        lbl.setOpaque(true);


        panel.add(btn);panel.add(btn2);panel.add(btn3);
        add(panel);
        add("South",lbl);

        btn.addMouseListener(btnMouseListener);
        btn2.addMouseListener(btnMouseListener);
        btn3.addMouseListener(btnMouseListener);

        SetFrame.setFrame(this, "MouseEvent Programming", 300, 300);
    }

    MouseListener btnMouseListener = new MouseListener() {



        @Override
        public void mouseClicked(MouseEvent e) {
            JButton eBtn = (JButton) e.getSource();
            Color color = null;
            System.out.println("마우스 클릭됨");
            lbl.setText("마우스 클릭됨");

            switch (eBtn.getText()) {
                case "red":
                    color = Color.RED;
                    break;
                case "green":
                    color = Color.GREEN;
                    break;
                case "blue":
                    color = Color.BLUE;
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("마우스 눌러짐");
            lbl.setText("마우스 눌러짐");
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
        new  MouseEventTest2();
    }
}
