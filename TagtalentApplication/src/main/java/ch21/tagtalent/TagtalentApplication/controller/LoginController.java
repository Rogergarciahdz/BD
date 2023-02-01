package ch21.tagtalent.TagtalentApplication.controller;


import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch21.tagtalent.TagtalentApplication.config.JwtFilter;
import ch21.tagtalent.TagtalentApplication.model.Token;
import ch21.tagtalent.TagtalentApplication.model.Usuario;
import ch21.tagtalent.TagtalentApplication.service.UsuarioService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;



@RestController
@RequestMapping (path = "/login/")
public class LoginController {
private final UsuarioService usuarioService;
	
	@Autowired
	public LoginController(UsuarioService usuarioService){
		this.usuarioService=usuarioService;
				
	}
	
	@PostMapping
	public Token login (@RequestBody Usuario usuario) throws ServletException {
		
		if (usuarioService.validaUsuario(usuario)) {
			return new Token(generateToken(usuario.getCorreo()));
		}
		throw new ServletException("Nombre de usuario o contraseña incorrectos");
		
		
	}//login
	
	
	
	private String generateToken(String username) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, 10);
		return Jwts.builder().setSubject(username).claim("role", "user")
				.setIssuedAt(new Date()).setExpiration(calendar.getTime())
				.signWith(SignatureAlgorithm.HS256, JwtFilter.secret).compact();
	}// generateToken
}
