package ar.edu.unju.fi.model;

public class Candidato {	
	private int codigo;
	private String nombre;
	private String genero;
	private String descripcion;
	private int votos;
	
	public Candidato() {}
	
	public Candidato(int codigo, String nombre, String genero, String descripcion, int votos) {
		super();
		this.codigo=codigo;
		this.nombre = nombre;
		this.genero = genero;
		this.descripcion = descripcion;
		this.votos = votos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
		
	
}
