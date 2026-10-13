package ai1013;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;

public class TextFieldAreaPassword extends JFrame {
    public TextFieldAreaPassword() {
        setTitle("문자열 입력 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField textfield = new JTextField("", 20);
        JTextArea area = new JTextArea("", 5, 20);
        JPasswordField passwordField = new JPasswordField("", 20);

        add(textfield);
        add(area);
        add(passwordField);

        int w = 250, h=250;
        int[] locations = CenterFrame.getLocation(w,h);
        setBounds(locations[0],locations[1],w,h);
        setVisible(true);
    }
}
