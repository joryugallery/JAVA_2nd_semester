package ai0929.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest extends JFrame {

    ButtonTest() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        toolkit.getScreenSize();
        Dimension dimension = toolkit.getScreenSize();

        setTitle("Button 컴포넌트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        int sw = dimension.width;
        int sh = dimension.height;

        int w = sw/2;
        int h = sh/2;

        int x = sw / 2 - w / 2;
        int y = sh / 2 - h / 2;

        JButton btn = new JButton("메시지 대화상자 보이기");

        btn.setBounds(x, y, w, h);

        add(btn);

        btn.addActionListener(new ButtonActionListener());

        setSize(w,h);

        setLocation(x,y);
        setVisible(true);
    }

    public class ButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(
                    null,
                    "버튼을 클릭했습니다."
            );

        }
    }

    public static void main(String[] args) {
        new ButtonTest();
    }
}