package ai1028;

import javax.swing.*;
import java.awt.*;

public class GraphicPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 테두리를 부드럽게 (안티앨리어싱)
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. 빨간 채운 사각형
        g2.setColor(Color.RED);
        g2.fillRect(30, 30, 120, 80);

        // 2. 파란 테두리 원
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(3));
        g2.drawOval(180, 30, 100, 100);

        // 3. 초록 채운 삼각형 (다각형)
        int[] xs = {360, 310, 410};
        int[] ys = {30, 130, 130};
        g2.setColor(new Color(0, 160, 0));
        g2.fillPolygon(xs, ys, 3);

        // 4. 주황 둥근 사각형
        g2.setColor(Color.ORANGE);
        g2.fillRoundRect(30, 170, 140, 80, 30, 30);

        // 5. 보라 호 (부채꼴)
        g2.setColor(new Color(128, 0, 200));
        g2.fillArc(200, 160, 100, 100, 30, 300);

        // 6. 검은 대각선
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(330, 170, 420, 260);

        // 7. 글자
        g2.setFont(new Font("SansSerif", Font.BOLD, 20));
        g2.drawString("Hello Graphics!", 150, 300);
    }

    // 바로 실행해 볼 수 있는 테스트용 main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GraphicPanel");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new GraphicPanel());
            frame.setSize(470, 360);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}