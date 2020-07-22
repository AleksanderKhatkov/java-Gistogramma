import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DemoGistogramma {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(3);
        list.add(7);
        list.add(11);
        list.add(9);
        HoGistogramma component = new HoGistogramma(list);
        frame.add(component);

        frame.setVisible(true);

    }
}

