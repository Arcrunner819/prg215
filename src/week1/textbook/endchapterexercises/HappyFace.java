package week1.textbook.endchapterexercises;

import javax.swing.JApplet;
import java.awt.Graphics;

public class HappyFace extends JApplet{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics canvas) {
        super.paint(canvas);
        canvas.drawOval(100, 50, 200, 200);
        canvas.fillOval(155, 100, 10, 20);
        canvas.fillOval(230, 100, 10, 20);
        canvas.drawArc(150, 160, 100, 50, 180, 180);
    }
}

