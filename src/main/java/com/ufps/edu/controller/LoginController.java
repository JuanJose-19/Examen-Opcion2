package com.ufps.edu.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ufps.edu.model.dao.IUsuarioDao;
import com.ufps.edu.model.entity.Usuario;

@Controller
public class LoginController {
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Autowired
	private BCryptPasswordEncoder enconder;
	
	@PostMapping("/login")
	public String login(@RequestParam String usuario, @RequestParam String clave,Model model) {
		if(usuario.isEmpty()||usuario==null||clave.isEmpty()||clave==null) {
			model.addAttribute("error", "Por Favor diligencie bien el formulario");
			return "login";
		}
		Optional<Usuario> opt=usuarioDao.findByUsuario(usuario);
		if(opt.isEmpty()) {
			model.addAttribute("error", "Este usuario no existe");
			return "login";
		}
		Usuario user=opt.get();
		
		if(!enconder.matches(clave, user.getClave())) {
			model.addAttribute("error", "clave Incorrecta");
			return "login";
		}
		return "indexOp2";

		
	}

}
