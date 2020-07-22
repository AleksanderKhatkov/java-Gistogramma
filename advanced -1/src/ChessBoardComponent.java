import java.awt.*;
import javax.swing.JComponent;

public class ChessBoardComponent extends JComponent {
    private int size;
    private Color color;

    public ChessBoardComponent(int size, Color color) {
        super();
        this.size = size;
        this.color = color;
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        int w = getWidth() / size;
        int h = getHeight() / size;

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                Color curColor = (i + j) % 2 == 0 ? color : Color.WHITE;
                gr.setColor(curColor);
                gr.fillRect(i * w, j * h, w, h);
            }
        }
                gr.setColor(Color.BLACK);
                gr.drawString("a", 10, 10);
                gr.drawString("b", 50, 10);
                gr.drawString("c", 80, 10);
                gr.drawString("d", 120, 10);
                gr.drawString("e", 160, 10);
                gr.drawString("f", 190, 10);
                gr.drawString("g", 230, 10);
                gr.drawString("h", 270, 10);

                gr.setColor(Color.RED);
                gr.drawString("8", 10, 20);
                gr.drawString("7", 10, 70);
                gr.drawString("6", 10, 110);
                gr.drawString("5", 10, 160);
                gr.drawString("4", 10, 210);
                gr.drawString("3", 10, 250);
                gr.drawString("2", 10, 300);
                gr.drawString("1", 10, 350);
            }
        }
