package ar.edu.unju.fi.lista;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.fi.model.Candidato;
//creacion de lista
public class ListaCandidatos {
	List <Candidato> listaCandidatos = new ArrayList<>();
	
	public ListaCandidatos() {
		listaCandidatos.add(new Candidato(000,"ninguno","---","---",0));
	}
	
	public ListaCandidatos(List<Candidato> listaCandidatos) {
		super();
		this.listaCandidatos = listaCandidatos;
	}
	

	public List<Candidato> getListaCandidatos() {
		return listaCandidatos;
	}
	/**
	 * Guarda un candadidato en una lista de candidatos.
	 * @param nuevoCandidato
	 */
	public void setListaCandidatos(Candidato nuevoCandidato) {
		listaCandidatos.add(nuevoCandidato);
	}
	
}
