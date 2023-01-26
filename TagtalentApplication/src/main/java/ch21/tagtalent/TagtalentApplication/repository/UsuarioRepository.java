package ch21.tagtalent.TagtalentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch21.tagtalent.TagtalentApplication.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}//interface UsuarioRepository