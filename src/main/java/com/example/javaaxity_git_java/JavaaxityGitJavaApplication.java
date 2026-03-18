package com.example.javaaxity_git_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaaxityGitJavaApplication {

	public String saludar(){
		return "Pohita te quiero";
	}



	public String bodrio(){
		return "que bodrio";
	}


	public String Pochita(){
		return "Hola soy pochita";
	}


	public static void main(String[] args) {
		// Crear una instancia de la clase
        JavaaxityGitJavaApplication app = new JavaaxityGitJavaApplication();
        
        // Llamar a los métodos y mostrar los resultados
        System.out.println(app.saludar());
        System.out.println(app.Pochita());
		System.out.println(app.bodrio());

		SpringApplication.run(JavaaxityGitJavaApplication.class, args);
	}

	

}
