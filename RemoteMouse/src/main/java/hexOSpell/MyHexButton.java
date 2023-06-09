package hexOSpell;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.Icon;
import javax.swing.JButton;

public class MyHexButton extends JButton{

	private static Icon label;

	public MyHexButton() {
		// TODO Auto-generated constructor stub
		super(label);
		Dimension size = getPreferredSize();
		size.width = size.height = Math.max(size.width, size.height);
		setPreferredSize(size);
		setContentAreaFilled(false);
	}

	int n=6; //Nº de lados del polígono
	int x[]= new int[n];
	int y[]= new int[n];
	double angle = 2*Math.PI/n;
	protected void paintComponent(Graphics g) {
	    if (getModel().isArmed()) {
	        g.setColor(Color.lightGray);
	    } else {
	        g.setColor(getBackground());
	    }
	    int x0 = getSize().width/2;
	    int y0 = getSize().height/2;
	    for(int i=0; i<n; i++) {
	        double v = i*angle;
	        x[i] = x0 + (int)Math.round((getWidth()/2)*Math.cos(v));
	        y[i] = y0 + (int)Math.round((getHeight()/2)*Math.sin(v));
	    }
	    g.fillPolygon(x, y, n);
	    super.paintComponent(g);
	}
	 
	protected void paintBorder(Graphics g) {
	    g.setColor(getForeground());
	    int x0 = getSize().width/2;
	    int y0 = getSize().height/2;
	    for(int i=0; i<n; i++) {
	        double v = i*angle;
	        x[i] = x0 + (int)Math.round((getWidth()/2)*Math.cos(v));
	        y[i] = y0 + (int)Math.round((getHeight()/2)*Math.sin(v));
	    }
	    g.drawPolygon(x, y, n);
	}
	 
	Polygon polygon;
	public boolean contains(int x1, int y1) {
	    if (polygon == null ||
	            !polygon.getBounds().equals(getBounds())) {
	        int x0 = getSize().width/2;
	        int y0 = getSize().height/2;
	        for(int i=0; i<n; i++) {
	            double v = i*angle;
	            x[i] = x0 + (int)Math.round((getWidth()/2)*Math.cos(v));
	            y[i] = y0 + (int)Math.round((getHeight()/2)*Math.sin(v));
	        }
	        polygon = new Polygon(x,y,n);
	    }
	    return polygon.contains(x1, y1);
	}
}
