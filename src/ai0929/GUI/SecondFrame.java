package ai0929.GUI;

import javax.swing.*;
import java.awt.*;

public class SecondFrame extends JFrame {
    public SecondFrame() {
        setLayout(new FlowLayout());
        setTitle("두번째 만든 윈도우창");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lbl1 = new JLabel("");
        add(lbl1);
        JLabel lbl2 = new JLabel("한국폴리텍대학 인공지능소프트웨어과");
        Font font = new Font("맑은 고딕", Font.BOLD, 30);
        lbl1.setFont(font);
        lbl2.setForeground(Color.RED);
        add(lbl2);

        JLabel lbl3 = new JLabel("한국폴리텍대학 인공지능소프트웨어과");
        Font font1 = new Font("맑은 고딕", Font.BOLD, 30);
        lbl3.setFont(font1);
        lbl3.setOpaque(true);
        lbl3.setForeground(Color.RED);
        add(lbl3);

        setSize(500,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SecondFrame();
    }

}
