/**
 * 
 */
package Actions;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * @author 2dam3
 *
 */
public class MouseController {
	
	final int movement = 100;
	public MouseController() {
		try {
			Robot r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/* Los movimientos de ratón se relacionan
	 * con los puntos cardinales:
	 * North - Arriba
	 * West - Izquierda
	 * East - Derecha
	 * South - Abajo
	 */
	public void moveNorth() {
		try {
			Robot r = new Robot();
			// get initial location
            Point p = MouseInfo.getPointerInfo().getLocation();
            r.mouseMove(p.x, p.y - movement);
            //System.out.println(p.x + " , " + p.y);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	public void moveNorthWest() {
		try {
			Robot r = new Robot();
			// get initial location
            Point p = MouseInfo.getPointerInfo().getLocation();
            r.mouseMove(p.x - movement, p.y - movement);
            //System.out.println(p.x + " , " + p.y);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	public void moveWest() {
		try {
			Robot r = new Robot();
			// get initial location
            Point p = MouseInfo.getPointerInfo().getLocation();
            r.mouseMove(p.x - movement, p.y);
            //System.out.println(p.x + " , " + p.y);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	public void moveSouthWest() {
		try {
			Robot r = new Robot();
			// get initial location
            Point p = MouseInfo.getPointerInfo().getLocation();
            r.mouseMove(p.x - movement, p.y + movement);
            //System.out.println(p.x + " , " + p.y);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	public void moveSouth() {
		try {
			Robot r = new Robot();
			// get initial location
            Point p = MouseInfo.getPointerInfo().getLocation();
            r.mouseMove(p.x, p.y + movement);
            //System.out.println(p.x + " , " + p.y);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	public void moveSouthEast() {
		try {
			Robot r = new Robot();
			// get initial location
            Point p = MouseInfo.getPointerInfo().getLocation();
            r.mouseMove(p.x + movement, p.y + movement);
            //System.out.println(p.x + " , " + p.y);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	public void moveEast() {
		try {
			Robot r = new Robot();
			// get initial location
            Point p = MouseInfo.getPointerInfo().getLocation();
            r.mouseMove(p.x + movement, p.y);
            //System.out.println(p.x + " , " + p.y);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}

	public void moveNorthEast() {
		try {
			Robot r = new Robot();
			// get initial location
            Point p = MouseInfo.getPointerInfo().getLocation();
            r.mouseMove(p.x + movement, p.y - movement);
            //System.out.println(p.x + " , " + p.y);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	//Click Izquierdo
	public void keyLeft() {
		try {
			Robot r = new Robot();
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	//Click Central
	public void keyCentre() {
		
		try {
			Robot r = new Robot();
			r.mousePress(InputEvent.BUTTON2_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	//Click Derecho
	public void keyRight() {
		try {
			Robot r = new Robot();
			r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
			r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
	
	public void presskeyboard(String key) {
		try {
			Robot r = new Robot();
			r.mousePress(KeyEvent.VK_A);
			r.mouseRelease(KeyEvent.VK_A);
		}
		catch (Exception e){
			System.err.println(e.getStackTrace());
		}
	}
}
