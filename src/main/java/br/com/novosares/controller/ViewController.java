package br.com.novosares.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contato")
	public String Pagina_contato() {		
		return "Pagina_contato";
	}

	@GetMapping("/destino")
	public String Paginadestino() {
		return "Pagina_destino";
	}

	@GetMapping("/casal")
	public String Pagina_casal() {
			return "Pagina_promo_casal";
		}

	@GetMapping("/familia")
	public String Pagina_familia() {
		return "Pagina_promo_familia";
	}
	
	@GetMapping("/solteiro")
	public String Pagina_solteiro() {
		return "Pagina_promo_solteiro";
	}

	
	@GetMapping("/login")
	public String login() {		
		return "login";
	}

}
