package ai1006;

import center.CenterFrame;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonTest extends JFrame {

    RadioButtonTest() {
        setTitle("라디오버튼 테스트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panNorth = new JPanel();
        String[] entertainers = {"장원영", "미나미", "설윤"};
        JRadioButton[] radioButtons = new JRadioButton[entertainers.length];
        ImageIcon[] imageIcons = new ImageIcon[entertainers.length];
        ButtonGroup group = new ButtonGroup();   // 하나만 선택되도록 묶기
        JLabel lbl = new JLabel();

        int i = 0;
        for (String entertainer : entertainers) {
            imageIcons[i] = new ImageIcon("imgs/img" + (i + 1) + ".png");
            radioButtons[i] = new JRadioButton(entertainer);

            final int idx = i;   // 리스너 안에서 쓸 수 있도록 복사
            radioButtons[i].addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        lbl.setIcon(imageIcons[idx]);
                    }
                }
            });

            group.add(radioButtons[i]);
            panNorth.add(radioButtons[i]);
            i++;
        }

        add("North", panNorth);
        add("Center", lbl);

        // 처음에는 첫 번째 사람이 선택된 상태로 시작 (이때 리스너가 호출되어 사진도 바뀜)
        radioButtons[0].setSelected(true);

        int w = 500;
        int h = 500;
        int[] location = CenterFrame.getLocation(w, h);
        setBounds(location[0], location[1], w, h);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonTest();
    }
}