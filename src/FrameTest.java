import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;

import javax.swing.*;
public class FrameTest extends JFrame{
public FrameTest() {
	Toolkit kit=Toolkit.getDefaultToolkit();
	Dimension screensize=kit.getScreenSize();
	int height=screensize.height;
	int width=screensize.width;
	   setSize(height/2, width/2);
	   setLocationByPlatform(true);
	   setTitle("The first test");
	   setName("test");
	   JComponentTest b=new JComponentTest();
	   add(b);
}
private class JComponentTest extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2=(Graphics2D)g;
		double leftX=100;
		double leftY=100;
		double width=200;
		double height=150;
		g2.setPaint(Color.RED);
		Rectangle2D rect=new Rectangle2D.Double(leftX,leftY,width,height);
		g2.fill(rect);
	}
}
	public static void main(String[] args) {

   JFrame a=new FrameTest();
   a.setVisible(true);

	}

}
