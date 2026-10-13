package ai1013;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListComboBoxTest extends JFrame {
    public ListComboBoxTest() {
        setTitle("ListComboBoxTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        String[] items = {"강아지", "고양이", "토끼", "미어캣", "코알라"};
        JList list = new JList();
        JComboBox comboBox = new JComboBox(items);
        comboBox.addItemListener(comboListner);

        add("North",comboBox);
        add("Center",list);

        int w=250, h=250;
        int[] locations = CenterFrame.getLocation(w,h);
        setBounds(locations[0],locations[1],w,h);
        setVisible(true);
    }

    ItemListener comboListner = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            ImageIcon icon = null;
            int imgPath = 0;
            String selectedItem = (String) e.getItem();
            switch (selectedItem) {
                case "강아지":
                    imgPath = 1;
                    break;
                case "고양이":
                    imgPath = 2;
                    break;
                case "토끼":
                    imgPath = 3;
                    break;
                case "미어캣":
                    imgPath = 4;
                    break;



            }

            icon = new  ImageIcon("imgs/animals/animal0" + imgPath + ".jpeg");

        }
    };

    public static void main(String[] args) {
        new ListComboBoxTest();
    }
}
