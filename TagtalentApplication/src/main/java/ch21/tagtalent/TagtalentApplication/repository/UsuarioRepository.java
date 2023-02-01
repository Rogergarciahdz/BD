package ch21.tagtalent.TagtalentApplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch21.tagtalent.TagtalentApplication.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	@Query("SELECT u FROM Usuario u WHERE u.correo=?1")
	Optional<Usuario> findByCorreo(String correo);
}//interface UsuarioRepository