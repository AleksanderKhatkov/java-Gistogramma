import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class HoGistogramma extends JComponent {
    private List<Integer> list;

    public HoGistogramma(List<Integer> list) {
        super();
        this.list = list;
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        int dx = getWidth() / Collections.max(list);
        int dy = getHeight() / list.size();

        for (int i=0; i<list.size(); ++i) {
            //Color color = new Color(red,green,blue);
            gr.drawRect(0, dy*i, dx*list.get(i), dy);
        }
    }
}