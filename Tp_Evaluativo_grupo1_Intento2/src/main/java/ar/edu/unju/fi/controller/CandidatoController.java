package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ar.edu.unju.fi.lista.ListaCandidatos;
import ar.edu.unju.fi.model.Candidato;

@Controller
public class CandidatoController {
	ListaCandidatos listaCandidatos = new ListaCandidatos();

	Candidato nuevoCandidato = new Candidato();

	@GetMapping("/NuevoCan")
	public String getIndexPage(Model model) {
		model.addAttribute("candidato", nuevoCandidato);
		return "candidato";
	}
	//29-11
	// devolucion de la aplicacion al cargar un nuevo curso.
	@PostMapping("/candidato/guardar")
	public String guardarCurso(@ModelAttribute("candidato") Candidato nuevoCandidato, Model model) {
		listaCandidatos.setListaCandidatos(nuevoCandidato);
		// mostramos la lista con todos los cursos.
		return ("index");
	}
	//devuelve una tabla que muestra los candidatos para seleccionar el que se desea modificar
		@GetMapping("/Modificacion")
		public String getListaCandidatos(Model model) {
			model.addAttribute("candidatos", listaCandidatos.getListaCandidatos());
			return "lista_candidatos";
		}
		//respuesta a la solicitud modificar candidato
		@GetMapping("/editar/{codigo}")
		public String getEditarCand(@PathVariable(value="codigo")int codigo,Model model) {
			Candidato uncandid= new Candidato() ;
			//busco el objeto seleccionado para modificar en la lista de candidatos
			for(Candidato t : listaCandidatos.getListaCandidatos()) {
				if(t.getCodigo()==codigo) {
					uncandid=t;
				}
			}
			model.addAttribute("candidato", uncandid);
			// mostramos la lista con todos los cursos.
			return "editar_candidato";
		}
		//modificar un elemento de la lista de candidatos
		@PostMapping("/modificar")
		public String guardarCandidatoEditar(@ModelAttribute("candidato") Candidato nuevoCandid, Model model) {
			//busco el objeto seleccionado para modificar en la lista de candidatos
			for(Candidato t : listaCandidatos.getListaCandidatos()) {
				if(t.getCodigo()==nuevoCandid.getCodigo()) {
					t.setDescripcion(nuevoCandid.getDescripcion());
					t.setGenero(nuevoCandid.getGenero());
					t.setNombre(nuevoCandid.getNombre());
				}
			}
			//pasamos el objeto para que sea mosytado en la trabla
			model.addAttribute("candidatos", listaCandidatos.getListaCandidatos());
			// mostramos la lista con todos los cursos.
			return ("index");
		}
		//respuesta a la solicitud eliminar candidato
		@GetMapping("/eliminar/{codigo}")
		public String getEliminarCand(@PathVariable(value="codigo")int codigo,Model model) {
			//busco el objeto seleccionado para modificar en la lista de candidatos
			int cont,cambio;
			cont=0;
			cambio=0;
			for(Candidato t : listaCandidatos.getListaCandidatos()) {
				cont++;
				
				if(t.getCodigo()==codigo) {
					
					cambio=cont;
					
				}
			}
		listaCandidatos.getListaCandidatos().remove(cambio);
		cambio=0;
		/*for (int i= listaCandidatos.getListaCandidatos().size(); i>=0;i--) {
				if(listaCandidatos.getListaCandidatos(i.)) {
					lista.remove(i);
					}
			}
			*/
			
			
			// mostramos la lista con todos los cursos.
			return "index";
		}
		//29-11
}
