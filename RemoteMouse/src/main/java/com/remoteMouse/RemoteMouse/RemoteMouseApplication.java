package com.remoteMouse.RemoteMouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RemoteMouseApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RemoteMouseApplication.class, args);
		// Hay que declarar la aplicación con Head, para que la librería MouseInfo pueda funcionar
		SpringApplication application = new SpringApplication(RemoteMouseApplication.class);
		   application.setHeadless(false);
		   application.run(args);
	}

}
