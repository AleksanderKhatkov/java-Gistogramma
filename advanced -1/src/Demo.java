import java.awt.*;
import javax.swing.JFrame;


public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ChessBoardComponent component = new ChessBoardComponent(8, Color.BLUE);
        frame.add(component);
        frame.setVisible(true);

    }
}
