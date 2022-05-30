package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.fi.lista.ListaUsuarios;
import ar.edu.unju.fi.model.Usuario;

@Controller
public class UsuarioController {

	ListaUsuarios listaUsuario = new ListaUsuarios();
	Usuario usuar = new Usuario();
	@GetMapping("/nuevoUsuario")
	public String getFormUsuario(Model model){
		model.addAttribute("usuario", usuar);
		return "usuario";
	}
	@PostMapping("/Usuario/guardado")
	public String guardarUsuario(@ModelAttribute("Usuario") Usuario usuar){
		listaUsuario.setListaUsuario(usuar);
		return "votacion";
	}
}
