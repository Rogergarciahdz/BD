package ch21.tagtalent.TagtalentApplication.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch21.tagtalent.TagtalentApplication.model.Usuario;
import ch21.tagtalent.TagtalentApplication.service.UsuarioService;

@RestController
@RequestMapping(path ="/usuario/")

public class UsuarioController {
private final UsuarioService usuarioService;

@Autowired
public UsuarioController(UsuarioService usuarioService) {
	this.usuarioService=usuarioService;
}


@GetMapping
public List<Usuario> getAllUsuarios(){
	return usuarioService.getAllUsuarios();
}

@GetMapping(path = "{usrId}")//http://localhost:8080/api/productos/1
public Usuario getUsuario(@PathVariable("usrId") Long Id) {
	return usuarioService.getUsuario(Id);
}

@DeleteMapping(path = "{usrId}")//http://localhost:8080/api/productos/1
public Usuario deleteUsuario(@PathVariable("usrId") Long Id) {
	return usuarioService.deleteUsuario(Id);
}

@PostMapping
public Usuario addusuUsuario(@RequestBody Usuario usuario) {
	return usuarioService.addUsuario(usuario);
}

@PutMapping(path = "{usrId}")//http://localhost:8080/api/productos/1
public Usuario updateUsuario(@PathVariable("usrId") Long Id,
	@RequestParam(required = false) String nombre,
	@RequestParam(required = false) String apellido,
	@RequestParam(required = false) String correo,
	@RequestParam(required = false) Long telefono,
	@RequestParam(required = false) String password,
	@RequestParam(required = false) String newPassword,
	@RequestParam(required = false) String foto,
	@RequestParam(required = false) String descripcion,
	@RequestParam(required = false) String ciudad) {
	
	return usuarioService.updateUsuario(Id, nombre, apellido, correo, telefono,password,newPassword,foto,descripcion,ciudad);
}

	

}
