package ai1103;

import center.SetFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuTest extends JFrame {

    JTextArea textArea;

    MenuTest(){
        add(textArea);
        setLayout(new FlowLayout());
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        add(menuBar);
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        JMenuItem newMenuItem = new JMenuItem("New File");
        JMenuItem OpenMenuItem = new JMenuItem("Open File");
        JMenuItem CloseMenuItem = new JMenuItem("Close File");
        fileMenu.add(newMenuItem);
        fileMenu.add(OpenMenuItem);
        fileMenu.add(CloseMenuItem);

        JMenuItem redMenuItem = new JMenuItem("Red");
        JMenuItem blueMenuItem = new JMenuItem("Blue");
        JMenuItem magentaMenuItem = new JMenuItem("Magenta");
        editMenu.add(redMenuItem);
        editMenu.add(blueMenuItem);
        editMenu.add(magentaMenuItem);

        redMenuItem.addActionListener(backgroundListener);


        SetFrame.setFrame(this, "메뉴만들기", 500, 500);
    }

    ActionListener backgroundListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Color color = null;
            switch (e.getActionCommand()) {
                case "Red":
                    color = Color.RED;
                    break;
                case "Blue":
                    color = Color.BLUE;
                    break;
                case "Magenta":
                    color = Color.MAGENTA;
                    break;
            }
            textArea.setBackground(color);
        }
    };

    public static void main(String[] args){

    }
}
