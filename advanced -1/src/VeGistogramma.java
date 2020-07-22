import java.awt.*;
import java.util.Collections;
import java.util.List;

/*дописать цвет в гистограмму*/

import javax.swing.JComponent;

public class VeGistogramma extends JComponent {
    private List<Integer> list;


    public VeGistogramma(List<Integer> list) {
        super();
        this.list = list;
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        int dx = getWidth() / list.size();
        int dy = getHeight() / Collections.max(list);

        for (int i = 0; i < list.size(); ++i) {
            //Color color = new Color(red,green,blue);
            gr.setColor(Color.GRAY);
            gr.drawRect(dx * i, getHeight() - dy * list.get(i), dx, dy * list.get(i));

            //gr.setColor(color);

        }
    }
}