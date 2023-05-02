package com.remoteMouse.RemoteMouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Actions.MouseController;

@RestController
public class MouseControllerApi {

	MouseController mc = new MouseController();
	/* Los movimientos de ratón se relacionan
	 * con los puntos cardinales:
	 * North - Arriba
	 * West - Izquierda
	 * East - Derecha
	 * South - Abajo
	 */
	
	@GetMapping("/remoteMouse")
	public String Description() {
		return "This is an api made for remote control of mouse actions.";
	}
	
	@GetMapping("/remoteMouse/north")
	public String North() {
		mc.moveNorth();
		return "North";
	}
	
	@GetMapping("/remoteMouse/northWest")
	public String NorthWest() {
		mc.moveNorthWest();
		return "NorthWest";
	}
	
	@GetMapping("/remoteMouse/west")
	public String West() {
		mc.moveWest();
		return "West";
	}
	
	@GetMapping("/remoteMouse/southWest")
	public String SouthWest() {
		mc.moveSouthWest();
		return "SouthWest";
	}
	
	@GetMapping("/remoteMouse/south")
	public String South() {
		mc.moveSouth();
		return "South";
	}
	
	@GetMapping("/remoteMouse/southEast")
	public String SouthEast() {
		mc.moveSouthEast();
		return "SouthEast";
	}
	
	@GetMapping("/remoteMouse/east")
	public String East() {
		mc.moveEast();
		return "East";
	}
	
	@GetMapping("/remoteMouse/northEast")
	public String NorthEast() {
		mc.moveNorthEast();
		return "NorthEast";
	}
	
	//Click Izquierdo
	@GetMapping("/remoteMouse/lclick")
	public String LClick() {
		mc.keyLeft();
		return "Left Click";
	}
	
	//Click Central
	@GetMapping("/remoteMouse/cclick")
	public String CClick() {
		mc.keyCentre();
		return "Center Click";
	}
	
	//Click Derecho
	@GetMapping("/remoteMouse/rclick")
	public String RClick() {
		mc.keyRight();
		return "Right Click";
	}
}
