package com.remoteMouse.RemoteMouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Actions.MouseController;
import hexOSpell.Hive8;

@RestController
public class MouseControllerApi {

	MouseController mc = new MouseController();
	Hive8 speller = new Hive8();
	int mode = 1; // modo 1 = ratón; modo 2 = hexOSpell
	/* Los movimientos de ratón se relacionan
	 * con los puntos cardinales:
	 * North - Arriba
	 * West - Izquierda
	 * East - Derecha
	 * South - Abajo
	 */
	
	@GetMapping("/remoteMouse")
	public String Description() {
		mode = 1;
		return "This is an api made for remote control of mouse actions.";
	}
	
	@GetMapping("/remoteMouse/north")
	public String North() {
		if(mode == 1)
			mc.moveNorth();
		else
			speller.moveNorth();
		return "North";
	}
	
	@GetMapping("/remoteMouse/northWest")
	public String NorthWest() {
		if(mode == 1)
			mc.moveNorthWest();
		else
			speller.moveNorthWest();
		return "NorthWest";
	}
	
	@GetMapping("/remoteMouse/west")
	public String West() {
		mc.moveWest();
		return "West";
	}
	
	@GetMapping("/remoteMouse/southWest")
	public String SouthWest() {
		if(mode == 1)
			mc.moveSouthWest();
		else
			speller.moveSouthWest();
		return "SouthWest";
	}
	
	@GetMapping("/remoteMouse/south")
	public String South() {
		if(mode == 1)
			mc.moveSouth();
		else
			speller.moveSouth();
		return "South";
	}
	
	@GetMapping("/remoteMouse/southEast")
	public String SouthEast() {
		if(mode == 1)
			mc.moveSouthEast();
		else
			speller.moveSouthEast();
		return "SouthEast";
	}
	
	@GetMapping("/remoteMouse/east")
	public String East() {
		mc.moveEast();
		return "East";
	}
	
	@GetMapping("/remoteMouse/northEast")
	public String NorthEast() {
		if(mode == 1)
			mc.moveNorthEast();
		else
			speller.moveNorthEast();
		return "NorthEast";
	}
	
	//Click Izquierdo
	@GetMapping("/remoteMouse/lclick")
	public String LClick() {
		if(mode == 1)
			mc.keyLeft();
		else
			speller.Click();
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
	
	//Cambio Modo
	@GetMapping("/remoteMouse/changemode")
	public String changeMode() {
		if(mode == 1) {
			speller.launch();
			mode = 2;
			}
		else {
			speller.close();
			mode = 1;
			}
		return "Mode Changed";
	}
}
