package ar.edu.unju.fi.model;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.format.annotation.DateTimeFormat;

public class Usuario {
	private String nombre;
	private String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate nacimiento;
	private int edad;
	
	public Usuario() {}
	
	public Usuario(String nombre, String email, LocalDate nacimiento) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.nacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	
	public int calcularEdad() {
		Period edad = Period.between(this.getNacimiento(), LocalDate.now());
		       return edad.getYears();
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = calcularEdad();
	}
	
	
}
