package ch21.tagtalent.TagtalentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch21.tagtalent.TagtalentApplication.model.Publicacion;

public interface PublicacionRepository extends JpaRepository<Publicacion, Long>{

}//interface PublicacionRepository