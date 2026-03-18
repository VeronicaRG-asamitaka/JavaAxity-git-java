package com.example.javaaxity_git_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaaxityGitJavaApplication {

	public String saludar(){
		return "Pohita te quiero";
	}

	public String rollingeyes(){
		return "que curso tan bodrio";
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaaxityGitJavaApplication.class, args);
	}

}
