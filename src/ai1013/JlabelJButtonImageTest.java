package ai1013;

import center.CenterFrame;

import javax.swing.*;

public class JlabelJButtonImageTest extends JFrame {

    public JlabelJButtonImageTest() {
        setTitle("ImageIcon설정 컴포넌트");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Click Here~", new ImageIcon("imgs/fox1.png"));

        JLabel lbl  = new JLabel();
        lbl.setHorizontalAlignment(JLabel.CENTER);   // 이미지를 가운데 정렬

        // 버튼 클릭 시 라벨에 이미지 표시
        btn.addActionListener(e -> {
            lbl.setIcon(new ImageIcon("imgs/fox1.jpg"));
        });

        add("North", btn);
        add("Center", lbl);

        int w=350, h=350;
        int[] locations = CenterFrame.getLocation(w, h);
        setBounds(locations[0], locations[1], w, h);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JlabelJButtonImageTest();
    }
}