package ch21.tagtalent.TagtalentApplication.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch21.tagtalent.TagtalentApplication.model.Usuario;
import ch21.tagtalent.TagtalentApplication.repository.UsuarioRepository;

@Service
public class UsuarioService {
	private final UsuarioRepository usuarioRepository;
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}//constructor
	
	public List<Usuario> getAllUsuarios(){
		return usuarioRepository.findAll();
	}//getAllUsuarios
	
	public Usuario getUsuario(Long id) {
		return usuarioRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El usuario con el id "+ 
						id + "no existe."));
	}//getUsuario
	
	public Usuario deleteUsuario(Long id) {
		Usuario tmp= null;
		if(usuarioRepository.existsById(id)) {
			tmp= usuarioRepository.findById(id).get();
			usuarioRepository.deleteById(id);
			}//if
		return tmp;
	}//deleteUsuario
	
	public Usuario addUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}//addUsuario
	
	public Usuario updateUsuario(Long id, String nombre, String apellido, String correo, Long telefono, String password,
		 String foto, String descripcion, String ciudad) {
		Usuario tmp= null;
		if (usuarioRepository.existsById(id)) {
			tmp = usuarioRepository.findById(id).get();
			if (nombre!=null) tmp.setNombre(nombre); 
			if (apellido!=null) tmp.setApellido(apellido);; 
			if (correo!=null) tmp.setCorreo(correo); 
			if (telefono!=null) tmp.setTelefono(telefono); 
			if (password!=null) tmp.setPassword(password); 
			if (foto!=null) tmp.setFoto(foto);
			if (descripcion!=null) tmp.setDescripcion(descripcion);
			if (ciudad!=null) tmp.setCiudad(ciudad);
			usuarioRepository.save(tmp);
		} else {
			System.out.println("Upadate - El usuario con el id " + id + "no existe");
		}//else
		return tmp;
	}//updateUsuario
	
	
}//class UsuarioService
