package com.boolsadeideas.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boolsadeideas.springboot.web.app.model.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		model.addAttribute("titulo","hola spring frework");
		
		return "index";
	}
	
	@GetMapping("/usuario")
	public String perfil(Model model) {
		
		Usuario usuario =new Usuario();
		usuario.setNombre("Andres");
		usuario.setApellido("paramo");
		usuario.setEmail("Andres@email.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo","Perfil del usuario: ".concat(usuario.getNombre()));
		
		
		return "perfil";
	}
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
		
	
		model.addAttribute("titulo","Lista de usuarios");
		
		
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Andres","Guzman","andres@email.com"));
		usuarios.add(new Usuario("pedro","paramo","pedro@email.com"));
		usuarios.add(new Usuario("juan","doe","juan@email.com"));
		return usuarios;
	} 
	
	
}
