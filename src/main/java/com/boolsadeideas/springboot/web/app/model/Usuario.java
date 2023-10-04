package com.boolsadeideas.springboot.web.app.model;


public class Usuario {
	
	private String nombre;
	private String apellido;
	private String Email;
	
	
	
	
	
	public Usuario() {
	
	}
	public Usuario(String nombre, String apellido, String email) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		Email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	
}
