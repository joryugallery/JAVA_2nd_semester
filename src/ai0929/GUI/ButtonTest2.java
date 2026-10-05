package ai0929.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest2 extends JFrame {

    ButtonTest2() {

        int w =500;
        int h = 200;

//        Dimension locationDim = CenterFrame.getLocation(w, h);
//        int x = locationDim.width;
//        int y = locationDim.height;

        int [] location = CenterFrame.getLocation(w,h);
        int x = location[0];
        int y = location[1];

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
        new ButtonTest2();
    }
}