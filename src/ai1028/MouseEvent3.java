package ai1028;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvent3 extends JFrame {
    JLabel lblImg = new JLabel();
    // 실제 파일명으로 바꾸세요
    ImageIcon icon1 = new ImageIcon(getClass().getResource("/ai1028/imgs/dark.png"));
    ImageIcon icon2 = new ImageIcon(getClass().getResource("/ai1028/imgs/illusion.jpg"));
    ImageIcon icon3 = new ImageIcon(getClass().getResource("/ai1028/imgs/Nirvana_NeverMind_Album_(1).jpg"));

    public MouseEvent3() {
        String[] btnText = {"use your illusion", "dark side of the moon", "nevermind"};
        JPanel panel = new JPanel();
        for (int i = 0; i < btnText.length; i++) {
            JButton btn = new JButton(btnText[i]);
            btn.addMouseListener(btnlistener);
            panel.add(btn);
        }
        add("North",panel);
        add(lblImg);
        lblImg.setOpaque(true);
        lblImg.setBackground(Color.white);
        lblImg.setHorizontalAlignment(JLabel.CENTER);

        SetFrame.setFrame(this, "버튼에 따른 이미지 변경", 500, 500);
    }

    MouseListener btnlistener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton btn = (JButton) e.getSource();
            String text = btn.getText();
            if (text.equals("use your illusion")) {
                lblImg.setIcon(icon1);
            } else if (text.equals("dark side of the moon")) {
                lblImg.setIcon(icon2);
            } else if (text.equals("nevermind")) {
                lblImg.setIcon(icon3);
            }
        }
    };

    public static void main(String[] args) {
        new MouseEvent3();
    }
}