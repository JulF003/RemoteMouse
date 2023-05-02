/**
 * 
 */
package Actions;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;

/**
 * @author 2dam3
 *
 */
public class MouseController {
	
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
            r.mouseMove(p.x, p.y - 100);
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
            r.mouseMove(p.x - 100, p.y - 100);
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
            r.mouseMove(p.x - 100, p.y);
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
            r.mouseMove(p.x - 100, p.y + 100);
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
            r.mouseMove(p.x, p.y + 100);
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
            r.mouseMove(p.x + 100, p.y + 100);
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
            r.mouseMove(p.x + 100, p.y);
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
            r.mouseMove(p.x + 100, p.y - 100);
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
}
