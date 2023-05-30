package hexOSpell;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hive8 extends JFrame{
	
	//Gestor de capas
	JLayeredPane pane;
	
	//Position
	String Position = "middle";
	String selected = "";
	
	//Hexagons
	MyHexButton top;
	MyHexButton topr;
	MyHexButton topl;
	MyHexButton middle;
	MyHexButton bottom;
	MyHexButton bottomr;
	MyHexButton bottoml;
	
	//Letres
	JButton a;
	JButton b;
	JButton c;
	JButton d;
	JButton e;
	JButton f;
	JButton g;
	JButton h;
	JButton i;
	JButton j;
	JButton k;
	JButton l;
	JButton m;
	JButton n;
	JButton ñ;
	JButton o;
	JButton p;
	JButton q;
	JButton r;
	JButton s;
	JButton t;
	JButton u;
	JButton v;
	JButton w;
	JButton x;
	JButton y;
	JButton z;
	JButton dot;
	JButton coma;
	JButton qmark;
	
	public Hive8() {
		super("HexOSpell"); 
		setSize(400, 400);  
	    pane = getLayeredPane(); 
	    
	  //creating Hexagonal buttons  
	    top = new MyHexButton();  
	    top.setBackground(Color.white);  
	    top.setBounds(150, 10, 100, 100);  
	    middle = new MyHexButton();  
	    middle.setBackground(Color.yellow);  
	    middle.setBounds(150, 95, 100, 100); 
	    bottom = new MyHexButton();  
	    bottom.setBackground(Color.white);  
	    bottom.setBounds(150, 180, 100, 100);
	    topr = new MyHexButton();  
	    topr.setBackground(Color.white);  
	    topr.setBounds(227, 53, 100, 100);
	    topl = new MyHexButton();  
	    topl.setBackground(Color.white);  
	    topl.setBounds(74, 53, 100, 100);
	    bottomr = new MyHexButton();  
	    bottomr.setBackground(Color.white);  
	    bottomr.setBounds(227, 137, 100, 100);
	    bottoml = new MyHexButton();  
	    bottoml.setBackground(Color.white);  
	    bottoml.setBounds(74, 137, 100, 100);
	    
	    // Create text buttons
	    a = new JButton();  
	    a.setText("a");
	    a.setBorder(BorderFactory.createEmptyBorder());
	    a.setBackground(Color.white);
	    a.setBounds(132, 72, 25, 25);
	    b = new JButton();  
	    b.setText("b");
	    b.setBorder(BorderFactory.createEmptyBorder());
	    b.setBackground(Color.white);
	    b.setBounds(110, 62, 25, 25);
	    c = new JButton();  
	    c.setText("c");
	    c.setBorder(BorderFactory.createEmptyBorder());
	    c.setBackground(Color.white);
	    c.setBounds(90, 72, 25, 25);
	    d = new JButton();  
	    d.setText("d");
	    d.setBorder(BorderFactory.createEmptyBorder());
	    d.setBackground(Color.white);
	    d.setBounds(90, 98, 25, 25);
	    e = new JButton();  
	    e.setText("e");
	    e.setBorder(BorderFactory.createEmptyBorder());
	    e.setBackground(Color.white);
	    e.setBounds(110, 117, 25, 25);
	    
	    f = new JButton();  
	    f.setText("f");
	    f.setBorder(BorderFactory.createEmptyBorder());
	    f.setBackground(Color.white);
	    f.setBounds(110, 145, 25, 25);
	    g = new JButton();  
	    g.setText("g");
	    g.setBorder(BorderFactory.createEmptyBorder());
	    g.setBackground(Color.white);
	    g.setBounds(90, 160, 25, 25);
	    h = new JButton();  
	    h.setText("h");
	    h.setBorder(BorderFactory.createEmptyBorder());
	    h.setBackground(Color.white);
	    h.setBounds(90, 190, 25, 25);
	    i = new JButton();  
	    i.setText("i");
	    i.setBorder(BorderFactory.createEmptyBorder());
	    i.setBackground(Color.white);
	    i.setBounds(110, 203, 25, 25);
	    j = new JButton();  
	    j.setText("j");
	    j.setBorder(BorderFactory.createEmptyBorder());
	    j.setBackground(Color.white);
	    j.setBounds(132, 190, 25, 25);
	    
	    k = new JButton();  
	    k.setText("k");
	    k.setBorder(BorderFactory.createEmptyBorder());
	    k.setBackground(Color.white);
	    k.setBounds(165, 200, 25, 25);
	    l = new JButton();  
	    l.setText("l");
	    l.setBorder(BorderFactory.createEmptyBorder());
	    l.setBackground(Color.white);
	    l.setBounds(165, 230, 25, 25);
	    m = new JButton();  
	    m.setText("m");
	    m.setBorder(BorderFactory.createEmptyBorder());
	    m.setBackground(Color.white);
	    m.setBounds(185, 245, 25, 25);
	    n = new JButton();  
	    n.setText("n");
	    n.setBorder(BorderFactory.createEmptyBorder());
	    n.setBackground(Color.white);
	    n.setBounds(210, 230, 25, 25);
	    ñ = new JButton();  
	    ñ.setText("ñ");
	    ñ.setBorder(BorderFactory.createEmptyBorder());
	    ñ.setBackground(Color.white);
	    ñ.setBounds(210, 200, 25, 25);
	    
	    o = new JButton();  
	    o.setText("o");
	    o.setBorder(BorderFactory.createEmptyBorder());
	    o.setBackground(Color.white);
	    o.setBounds(240, 190, 25, 25);
	    p = new JButton();  
	    p.setText("p");
	    p.setBorder(BorderFactory.createEmptyBorder());
	    p.setBackground(Color.white);
	    p.setBounds(265, 205, 25, 25);
	    q = new JButton();  
	    q.setText("q");
	    q.setBorder(BorderFactory.createEmptyBorder());
	    q.setBackground(Color.white);
	    q.setBounds(285, 190, 25, 25);
	    r = new JButton();  
	    r.setText("r");
	    r.setBorder(BorderFactory.createEmptyBorder());
	    r.setBackground(Color.white);
	    r.setBounds(285, 160, 25, 25);
	    s = new JButton(); 
	    s.setText("s");
	    s.setBorder(BorderFactory.createEmptyBorder());
	    s.setBackground(Color.white);
	    s.setBounds(265, 145, 25, 25);
	    
	    t = new JButton(); 
	    t.setText("t");
	    t.setBorder(BorderFactory.createEmptyBorder());
	    t.setBackground(Color.white);
	    t.setBounds(265, 115, 25, 25);
	    u = new JButton(); 
	    u.setText("u");
	    u.setBorder(BorderFactory.createEmptyBorder());
	    u.setBackground(Color.white);
	    u.setBounds(290, 100, 25, 25);
	    v = new JButton(); 
	    v.setText("v");
	    v.setBorder(BorderFactory.createEmptyBorder());
	    v.setBackground(Color.white);
	    v.setBounds(285, 75, 25, 25);
	    w = new JButton(); 
	    w.setText("w");
	    w.setBorder(BorderFactory.createEmptyBorder());
	    w.setBackground(Color.white);
	    w.setBounds(265, 60, 25, 25);
	    x = new JButton(); 
	    x.setText("x");
	    x.setBorder(BorderFactory.createEmptyBorder());
	    x.setBackground(Color.white);
	    x.setBounds(243, 75, 25, 25);
	    
	    y = new JButton(); 
	    y.setText("y");
	    y.setBorder(BorderFactory.createEmptyBorder());
	    y.setBackground(Color.white);
	    y.setBounds(210, 60, 25, 25);
	    z = new JButton(); 
	    z.setText("z");
	    z.setBorder(BorderFactory.createEmptyBorder());
	    z.setBackground(Color.white);
	    z.setBounds(210, 30, 25, 25);
	    dot = new JButton(); 
	    dot.setText(".");
	    dot.setBorder(BorderFactory.createEmptyBorder());
	    dot.setBackground(Color.white);
	    dot.setBounds(185, 18, 15, 15);
	    coma = new JButton(); 
	    coma.setText(",");
	    coma.setBorder(BorderFactory.createEmptyBorder());
	    coma.setBackground(Color.white);
	    coma.setBounds(165, 30, 15, 15);
	    qmark = new JButton(); 
	    qmark.setText("?");
	    qmark.setBorder(BorderFactory.createEmptyBorder());
	    qmark.setBackground(Color.white);
	    qmark.setBounds(165, 60, 25, 25);
	    
	    
	    //adding Hex buttons on pane  
	    pane.add(bottom, new Integer(1)); 
	    pane.add(bottomr, new Integer(1)); 
	    pane.add(bottoml, new Integer(1)); 
	    pane.add(middle, new Integer(1));  
	    pane.add(top, new Integer(1)); 
	    pane.add(topr, new Integer(1));  
	    pane.add(topl, new Integer(1));  
	    //adding Text buttons on different pane layer
	    pane.add(a, new Integer(2));
	    pane.add(b, new Integer(2));
	    pane.add(c, new Integer(2));
	    pane.add(d, new Integer(2));
	    pane.add(e, new Integer(2));
	    
	    pane.add(f, new Integer(2));
	    pane.add(g, new Integer(2));
	    pane.add(h, new Integer(2));
	    pane.add(i, new Integer(2));
	    pane.add(j, new Integer(2));
	    
	    pane.add(k, new Integer(2));
	    pane.add(l, new Integer(2));
	    pane.add(m, new Integer(2));
	    pane.add(n, new Integer(2));
	    pane.add(ñ, new Integer(2));
	    
	    pane.add(o, new Integer(2));
	    pane.add(p, new Integer(2));
	    pane.add(q, new Integer(2));
	    pane.add(r, new Integer(2));
	    pane.add(s, new Integer(2));
	    
	    pane.add(t, new Integer(2));
	    pane.add(u, new Integer(2));
	    pane.add(v, new Integer(2));
	    pane.add(w, new Integer(2));
	    pane.add(x, new Integer(2));
	    
	    pane.add(y, new Integer(2));
	    pane.add(z, new Integer(2));
	    pane.add(dot, new Integer(2));
	    pane.add(coma, new Integer(2));
	    pane.add(qmark, new Integer(2));
	}
	
	public void moveNorthEast() {
		switch(Position) {
			case "middle":
	            middle.setBackground(Color.white);
	            topl.setBackground(Color.yellow);
	            Position = "topl";
	            break;
	        case "topl":
	        	c.setBackground(Color.cyan);
	        	a.setBackground(Color.white);
	        	b.setBackground(Color.white);
	        	d.setBackground(Color.white);
	        	e.setBackground(Color.white);
	        	selected = "c";
	        	break;
	        case "bottoml":
	        	g.setBackground(Color.cyan);
	        	f.setBackground(Color.white);
	        	h.setBackground(Color.white);
	        	i.setBackground(Color.white);
	        	j.setBackground(Color.white);
	        	selected = "g";
	        	break; 
	        case "bottom":
	        	k.setBackground(Color.cyan);
	        	l.setBackground(Color.white);
	        	m.setBackground(Color.white);
	        	n.setBackground(Color.white);
	        	ñ.setBackground(Color.white);
	        	selected = "k";
	        	break; 
	        case "bottomr":
	        	o.setBackground(Color.white);
	        	p.setBackground(Color.white);
	        	q.setBackground(Color.white);
	        	r.setBackground(Color.white);
	        	s.setBackground(Color.white);
	        	bottomr.setBackground(Color.white);
	        	middle.setBackground(Color.yellow);
	        	Position = "middle";
	        	selected = "";
	        	break; 
	        case "topr":
	        	x.setBackground(Color.cyan);
	        	t.setBackground(Color.white);
	        	u.setBackground(Color.white);
	        	v.setBackground(Color.white);
	        	w.setBackground(Color.white);
	        	selected = "x";
	        	break; 
	        case "top":
	        	coma.setBackground(Color.cyan);
	        	y.setBackground(Color.white);
	        	z.setBackground(Color.white);
	        	dot.setBackground(Color.white);
	        	qmark.setBackground(Color.white);
	        	selected = "coma";
	        	break; 
		}
	}

	public void moveNorthWest() {
		switch(Position) {
			case "middle":
	            middle.setBackground(Color.white);
	            topr.setBackground(Color.yellow);
	            Position = "topr";
	            break;
	        case "topl":
	        	a.setBackground(Color.cyan);
	        	c.setBackground(Color.white);
	        	b.setBackground(Color.white);
	        	d.setBackground(Color.white);
	        	e.setBackground(Color.white);
	        	selected = "a";
	        	break;
	        case "bottoml":
	        	g.setBackground(Color.white);
	        	f.setBackground(Color.white);
	        	h.setBackground(Color.white);
	        	i.setBackground(Color.white);
	        	j.setBackground(Color.white);
	        	bottoml.setBackground(Color.white);
	        	middle.setBackground(Color.yellow);
	        	Position = "middle";
	        	selected = "";
	        	break; 
	        case "bottom":
	        	ñ.setBackground(Color.cyan);
	        	l.setBackground(Color.white);
	        	m.setBackground(Color.white);
	        	n.setBackground(Color.white);
	        	k.setBackground(Color.white);
	        	selected = "ñ";
	        	break; 
	        case "bottomr":
	        	o.setBackground(Color.white);
	        	p.setBackground(Color.white);
	        	q.setBackground(Color.white);
	        	r.setBackground(Color.cyan);
	        	s.setBackground(Color.white);
	        	selected = "r";
	        	break; 
	        case "topr":
	        	v.setBackground(Color.cyan);
	        	t.setBackground(Color.white);
	        	u.setBackground(Color.white);
	        	x.setBackground(Color.white);
	        	w.setBackground(Color.white);
	        	selected = "v";
	        	break; 
	        case "top":
	        	z.setBackground(Color.cyan);
	        	y.setBackground(Color.white);
	        	coma.setBackground(Color.white);
	        	dot.setBackground(Color.white);
	        	qmark.setBackground(Color.white);
	        	selected = "z";
	        	break; 
		}
	}

	public void moveNorth() {
		switch(Position) {
			case "middle":
	            middle.setBackground(Color.white);
	            top.setBackground(Color.yellow);
	            Position = "top";
	            break;
	        case "topl":
	        	b.setBackground(Color.cyan);
	        	c.setBackground(Color.white);
	        	a.setBackground(Color.white);
	        	d.setBackground(Color.white);
	        	e.setBackground(Color.white);
	        	selected = "b";
	        	break;
	        case "bottoml":
	        	g.setBackground(Color.white);
	        	f.setBackground(Color.cyan);
	        	h.setBackground(Color.white);
	        	i.setBackground(Color.white);
	        	j.setBackground(Color.white);
	        	selected = "f";
	        	break; 
	        case "bottom":
	        	ñ.setBackground(Color.white);
	        	l.setBackground(Color.white);
	        	m.setBackground(Color.white);
	        	n.setBackground(Color.white);
	        	k.setBackground(Color.white);
	        	bottom.setBackground(Color.white);
	        	middle.setBackground(Color.yellow);
	        	selected = "middle";
	        	selected = "";
	        	break; 
	        case "bottomr":
	        	o.setBackground(Color.white);
	        	p.setBackground(Color.white);
	        	q.setBackground(Color.white);
	        	s.setBackground(Color.cyan);
	        	r.setBackground(Color.white);
	        	selected = "s";
	        	break; 
	        case "topr":
	        	w.setBackground(Color.cyan);
	        	t.setBackground(Color.white);
	        	u.setBackground(Color.white);
	        	x.setBackground(Color.white);
	        	v.setBackground(Color.white);
	        	selected = "w";
	        	break; 
	        case "top":
	        	dot.setBackground(Color.cyan);
	        	y.setBackground(Color.white);
	        	coma.setBackground(Color.white);
	        	z.setBackground(Color.white);
	        	qmark.setBackground(Color.white);
	        	selected = "dot";
	        	break; 
		}
	}

	public void moveSouth() {
		switch(Position) {
			case "middle":
	            middle.setBackground(Color.white);
	            bottom.setBackground(Color.yellow);
	            Position = "bottom";
	            break;
	        case "topl":
	        	e.setBackground(Color.cyan);
	        	c.setBackground(Color.white);
	        	b.setBackground(Color.white);
	        	d.setBackground(Color.white);
	        	a.setBackground(Color.white);
	        	selected = "e";
	        	break;
	        case "bottoml":
	        	g.setBackground(Color.white);
	        	f.setBackground(Color.white);
	        	h.setBackground(Color.white);
	        	i.setBackground(Color.cyan);
	        	j.setBackground(Color.white);
	        	selected = "i";
	        	break; 
	        case "bottom":
	        	ñ.setBackground(Color.white);
	        	l.setBackground(Color.white);
	        	m.setBackground(Color.cyan);
	        	n.setBackground(Color.white);
	        	k.setBackground(Color.white);
	        	selected = "m";
	        	break; 
	        case "bottomr":
	        	o.setBackground(Color.white);
	        	p.setBackground(Color.cyan);
	        	q.setBackground(Color.white);
	        	r.setBackground(Color.white);
	        	s.setBackground(Color.white);
	        	selected = "p";
	        	break; 
	        case "topr":
	        	v.setBackground(Color.white);
	        	t.setBackground(Color.cyan);
	        	u.setBackground(Color.white);
	        	x.setBackground(Color.white);
	        	w.setBackground(Color.white);
	        	selected = "t";
	        	break; 
	        case "top":
	        	z.setBackground(Color.white);
	        	y.setBackground(Color.white);
	        	coma.setBackground(Color.white);
	        	dot.setBackground(Color.white);
	        	qmark.setBackground(Color.white);
	        	top.setBackground(Color.white);
	        	middle.setBackground(Color.yellow);
	        	Position = "middle";
	        	selected = "";
	        	break; 
		}
	}

	public void moveSouthEast() {
		switch(Position) {
			case "middle":
	            middle.setBackground(Color.white);
	            bottoml.setBackground(Color.yellow);
	            Position = "bottoml";
	            break;
	        case "topl":
	        	a.setBackground(Color.white);
	        	c.setBackground(Color.white);
	        	b.setBackground(Color.white);
	        	d.setBackground(Color.cyan);
	        	e.setBackground(Color.white);
	        	selected = "d";
	        	break;
	        case "bottoml":
	        	g.setBackground(Color.white);
	        	f.setBackground(Color.white);
	        	h.setBackground(Color.cyan);
	        	i.setBackground(Color.white);
	        	j.setBackground(Color.white);
	        	selected = "h";
	        	break; 
	        case "bottom":
	        	ñ.setBackground(Color.white);
	        	l.setBackground(Color.cyan);
	        	m.setBackground(Color.white);
	        	n.setBackground(Color.white);
	        	k.setBackground(Color.white);
	        	selected = "l";
	        	break; 
	        case "bottomr":
	        	o.setBackground(Color.cyan);
	        	p.setBackground(Color.white);
	        	q.setBackground(Color.white);
	        	r.setBackground(Color.white);
	        	s.setBackground(Color.white);
	        	selected = "o";
	        	break; 
	        case "topr":
	        	v.setBackground(Color.white);
	        	t.setBackground(Color.white);
	        	u.setBackground(Color.white);
	        	x.setBackground(Color.white);
	        	w.setBackground(Color.white);
	        	topr.setBackground(Color.white);
	        	middle.setBackground(Color.yellow);
	        	selected = "middle";
	        	selected = "";
	        	break; 
	        case "top":
	        	z.setBackground(Color.white);
	        	y.setBackground(Color.white);
	        	coma.setBackground(Color.white);
	        	dot.setBackground(Color.white);
	        	qmark.setBackground(Color.cyan);
	        	selected = "qmark";
	        	break; 
		}
	}

	public void moveSouthWest() {
		switch(Position) {
			case "middle":
	            middle.setBackground(Color.white);
	            bottomr.setBackground(Color.yellow);
	            Position = "bottomr";
	            break;
	        case "topl":
	        	a.setBackground(Color.white);
	        	c.setBackground(Color.white);
	        	b.setBackground(Color.white);
	        	d.setBackground(Color.white);
	        	e.setBackground(Color.white);
	        	topl.setBackground(Color.white);
	        	middle.setBackground(Color.yellow);
	        	Position = "middle";
	        	selected = "";
	        	break;
	        case "bottoml":
	        	g.setBackground(Color.white);
	        	f.setBackground(Color.white);
	        	h.setBackground(Color.white);
	        	i.setBackground(Color.white);
	        	j.setBackground(Color.cyan);
	        	selected = "j";
	        	break; 
	        case "bottom":
	        	ñ.setBackground(Color.white);
	        	l.setBackground(Color.white);
	        	m.setBackground(Color.white);
	        	n.setBackground(Color.cyan);
	        	k.setBackground(Color.white);
	        	selected = "n";
	        	break; 
	        case "bottomr":
	        	o.setBackground(Color.white);
	        	p.setBackground(Color.white);
	        	q.setBackground(Color.cyan);
	        	r.setBackground(Color.white);
	        	s.setBackground(Color.white);
	        	selected = "q";
	        	break; 
	        case "topr":
	        	v.setBackground(Color.white);
	        	t.setBackground(Color.white);
	        	u.setBackground(Color.cyan);
	        	x.setBackground(Color.white);
	        	w.setBackground(Color.white);
	        	selected = "u";
	        	break; 
	        case "top":
	        	z.setBackground(Color.white);
	        	y.setBackground(Color.cyan);
	        	coma.setBackground(Color.white);
	        	dot.setBackground(Color.white);
	        	qmark.setBackground(Color.white);
	        	selected = "y";
	        	break; 
		}
	}

	public void Click() {
		switch(Position){
			case "a":
	            a.setBackground(Color.green);
	            break;
			case "b":
	            b.setBackground(Color.green);
	            break;
			case "c":
	            c.setBackground(Color.green);
	            break;
			case "d":
	            d.setBackground(Color.green);
	            break;
			case "e":
				e.setBackground(Color.green);
	            break;
			case "f":
	            f.setBackground(Color.green);
	            break;
			case "g":
	            g.setBackground(Color.green);
	            break;
			case "h":
	            h.setBackground(Color.green);
	            break;
			case "i":
	            i.setBackground(Color.green);
	            break;
			case "j":
	            j.setBackground(Color.green);
	            break;
			case "k":
	            k.setBackground(Color.green);
	            break;
			case "l":
	            l.setBackground(Color.green);
	            break;
			case "m":
	            m.setBackground(Color.green);
	            break;
			case "n":
	            n.setBackground(Color.green);
	            break;
			case "o":
	            o.setBackground(Color.green);
	            break;
			case "p":
	            p.setBackground(Color.green);
	            break;
			case "q":
	            q.setBackground(Color.green);
	            break;
			case "r":
	            r.setBackground(Color.green);
	            break;
			case "s":
	            s.setBackground(Color.green);
	            break;
			case "t":
	            t.setBackground(Color.green);
	            break;
			case "u":
	            u.setBackground(Color.green);
	            break;
			case "v":
	            v.setBackground(Color.green);
	            break;
			case "w":
	            w.setBackground(Color.green);
	            break;
			case "x":
	            x.setBackground(Color.green);
	            break;
			case "y":
	            y.setBackground(Color.green);
	            break;
			case "z":
	            z.setBackground(Color.green);
	            break;
			case "dot":
	            dot.setBackground(Color.green);
	            break;
			case "coma":
	            coma.setBackground(Color.green);
	            break;
			case "ñ":
	            ñ.setBackground(Color.green);
	            break;
			case "qmark":
	            qmark.setBackground(Color.green);
	            break;
		}
	}

	public String Selected() {
		return Position;
	}
	
	public void close() {
		this.setVisible(false); //you can't see me!
		this.dispose(); //Destroy the JFrame object
	}
	
	public void launch() {
		//Hive8 panel = new  Hive8();
		
		//Colocar esquina inferior derecha
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
		Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
		int x = (int) rect.getMaxX() - this.getWidth();
	    int y = (int) rect.getMaxY() - this.getHeight() - 50;
	    this.setLocation(x, y);
	    
	    this.setVisible(true); 
		
	}
}
