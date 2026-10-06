package ai1006;

import center.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTest extends JFrame{

    CheckBoxTest(){
        setTitle("CheckBox 컴포넌트 연습");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JCheckBox check1 = new JCheckBox("클릭하세요");
        check1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(check1.isSelected()){
                    JOptionPane.showMessageDialog(null, "checkbox에 체크되어있네요");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Checkbox에 체크 되어있지 않네요");
                }
            }
        });

        add(check1);

        int w = 300, h=200;

        setSize(w,h);
        int[] location =  CenterFrame.getLocation(w,h);

        setLocation(location [0], location[1]);
        setVisible(true);
    }

    public static void main(String[] args){
        new CheckBoxTest();
    }
}
